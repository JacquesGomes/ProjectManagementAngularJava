import { Component } from '@angular/core';
import { ModalService } from '../../services/modal.service';

@Component({
  selector: 'app-modal-dialog',
  templateUrl: './modal-dialog.component.html',
})
export class ModalDialogComponent {
  constructor(private modalService: ModalService) {}

  openModal() {
    this.modalService.open();
  }

  closeModal() {
    this.modalService.close();
  }

  isModalOpen() {
    return this.modalService.isOpened();
  }


}
