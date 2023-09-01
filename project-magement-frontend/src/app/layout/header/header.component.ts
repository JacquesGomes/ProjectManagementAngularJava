import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  @Output() sidebarToggled = new EventEmitter<boolean>();
  
  // Initialize isSidebarOpen to true or false based on your initial state
  isSidebarOpen: boolean = true; // Set to true if sidebar should be initially open, or false if it should be initially closed

  toggleSidebar() {
    this.isSidebarOpen = !this.isSidebarOpen; // Toggle the state
    this.sidebarToggled.emit(this.isSidebarOpen); // Emit the updated state
  }
}
