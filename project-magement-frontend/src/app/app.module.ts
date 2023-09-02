import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'; // Import HttpClientModule


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { SidebarComponent } from './layout/sidebar/sidebar.component';
import { HeaderComponent } from './layout/header/header.component';
import { FooterComponent } from './layout/footer/footer.component';
import { ProjectsComponent } from './modules/projects/projects.component';
import { ProjectIdeasComponent } from './modules/project-ideas/project-ideas.component';
import { ModalContentComponent } from './shared/modal-content/modal-content.component';
import { ModalDialogComponent } from './shared/modal-dialog/modal-dialog.component';
import { MatIconModule } from '@angular/material/icon';

@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    HeaderComponent,
    FooterComponent,
    ProjectsComponent,
    ModalContentComponent,
    ModalDialogComponent,
  ],
  imports: [
    MatIconModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
