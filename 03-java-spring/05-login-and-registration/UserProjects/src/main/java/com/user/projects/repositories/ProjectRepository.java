package com.user.projects.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;

import org.springframework.data.repository.CrudRepository;

import com.user.projects.models.Project;


public interface ProjectRepository  extends CrudRepository<Project, Long> {

	// Create
	// Read
	// Update
	// Delete
	List<Project> findAll(); 
//	Select * from projects where Description like '%alog%';
	List<Project> findByDescriptionContaining(String search);
	List<Project> findAll(Sort sort); 
}
