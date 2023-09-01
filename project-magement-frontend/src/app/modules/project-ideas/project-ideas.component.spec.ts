import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjectIdeasComponent } from './project-ideas.component';

describe('ProjectIdeasComponent', () => {
  let component: ProjectIdeasComponent;
  let fixture: ComponentFixture<ProjectIdeasComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProjectIdeasComponent]
    });
    fixture = TestBed.createComponent(ProjectIdeasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
