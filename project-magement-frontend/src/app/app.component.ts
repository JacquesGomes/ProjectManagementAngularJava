import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'project-magement-frontend';

  isSidebarOpen = true;

  toggleSidebar(isOpen: boolean) {
    this.isSidebarOpen = isOpen;
  }
  
}
