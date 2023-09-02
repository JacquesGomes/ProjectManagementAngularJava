import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-modal-content',
  templateUrl: './modal-content.component.html',
  styleUrls: ['./modal-content.component.css']
})

export class ModalContentComponent implements OnInit{

  projectData: any;

  constructor(private dataService: DataService){}

  ngOnInit(): void {
    this.dataService.getData('projectModal').subscribe(data => {
      this.projectData = data;
    });
  }

}
