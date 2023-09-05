package org.example.controller;

import org.example.model.Project;
import org.example.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    private final ProjectService projectService;
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

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

    @GetMapping("/projectBasicInfo/{id}")
    public Project getProjectById(@PathVariable Long id){
        return projectService.getProjectBasicInfo(id);
    }


    @PostMapping("/project")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project createdProject = projectService.createProject(project);
        return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
    }

    @PutMapping("/projects")
    public Project updateProject(@RequestBody Project updatedProject) {
        return projectService.updateProject(updatedProject);
    }

    @DeleteMapping("/projects/{projectId}")
    public void deleteProject(@PathVariable Long projectId) {
        projectService.deleteProject(projectId);
    }





}
