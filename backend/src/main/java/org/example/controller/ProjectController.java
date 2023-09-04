package org.example.controller;

import org.example.model.Project;
import org.example.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    //crtl + shift + / = commment block or uncomment
    @GetMapping("/projectsDetails")
    public List<Project> getProjectsDetails(){
        return projectService.getAllProjectsWithDetails();
    }

    @GetMapping("/projectsBasicInfo")
    public List<Project> getProjects(){
        return projectService.getAllProjectsWithBasicInfo();
    }

    @GetMapping("/projectDetails/{id}")
    public Project getProject(@PathVariable Long id){
        return projectService.getProjectWithDetails(id);
    }


    @PostMapping("/create")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project createdProject = projectService.createProject(project);
        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public Project updateProject(@RequestBody Project updatedProject) {
        return projectService.updateProject(updatedProject);
    }

    @DeleteMapping("/delete/{projectId}")
    public void deleteProject(@PathVariable Long projectId) {
        projectService.deleteProject(projectId);
    }





}
