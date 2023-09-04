package org.example.repository;

import org.example.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("SELECT p FROM Project p LEFT JOIN FETCH p.projectDetails")
    List<Project> getAllProjectsWithDetails();

    @Query("SELECT p FROM Project p LEFT JOIN FETCH p.projectDetails WHERE p.id = :id")
    Project getProjectWithEagerDetails(Long id);

}
