package com.dojo.student.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.student.models.Project;
import com.dojo.student.models.Student;
import com.dojo.student.services.ProjectService;
import com.dojo.student.services.StudentService;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService pService;
	
	@Autowired
	private StudentService sService;
	
	// Get All projects
	@GetMapping("/projects")
	public String index(Model model) {
		List<Project> projects=this.pService.allProject();
		model.addAttribute("projects",projects);
		return "/projects/projects.jsp";
	}
   //Create a new project
	@GetMapping("/projects/new")
	public String newProject(@ModelAttribute("newProject") Project project, Model model ) {
		model.addAttribute("students",sService.allStudents());
		return "/projects/new.jsp";
	}
	@PostMapping("/projects/create")
	public String createProject(@ModelAttribute("newProject") Project project) {
		Project newProject=pService.createProject(project);
		return "redirect:/projects";
	}


}
