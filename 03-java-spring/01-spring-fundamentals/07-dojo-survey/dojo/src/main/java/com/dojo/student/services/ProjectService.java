package com.dojo.student.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.student.models.Project;
import com.dojo.student.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	//List All projects	
	public List<Project> allProject() {
        return projectRepository.findAll();
    }
	//Create New project
	public Project createProject(Project project) {
		return projectRepository.save(project);
	}
	
	
}
