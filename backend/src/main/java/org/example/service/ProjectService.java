package org.example.service;

import jakarta.transaction.Transactional;
import org.example.model.Project;
import org.example.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    public ProjectService(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }


    public Project createProject(Project project){
        Project createdProject = projectRepository.saveAndFlush(project);
        return createdProject;
    }

    public List<Project> getAllProjectsWithBasicInfo() {
        List<Project> projects = projectRepository.findAll();
        for (Project project : projects) {
            // Set the projectDetails attribute to null
            project.setProjectDetails(null);
        }
        return projects;
    }

    public List<Project> getAllProjectsWithDetails() {
        return projectRepository.getAllProjectsWithDetails();
    }

    public Project getProjectBasicInfo(Long id){
        Project project = projectRepository.findProjectById(id);
        project.setProjectDetails(null);
        return project;


    }

    public Project getProjectWithDetails(Long id) {
        return projectRepository.getProjectWithEagerDetails(id);
    }

    public void deleteProject(Long projectId) {
        // Delete a project by ID
        projectRepository.deleteById(projectId);
    }

    public Project updateProject(Project updatedProject) {
        // Update an existing project
        // You can add validation logic here if needed
        return projectRepository.saveAndFlush(updatedProject);
    }

}
