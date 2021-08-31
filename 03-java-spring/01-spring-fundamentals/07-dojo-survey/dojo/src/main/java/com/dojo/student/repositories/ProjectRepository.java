package com.dojo.student.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.student.models.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

// Create
// Read
// Update
// Delete
	List<Project> findAll();
	
	
}
