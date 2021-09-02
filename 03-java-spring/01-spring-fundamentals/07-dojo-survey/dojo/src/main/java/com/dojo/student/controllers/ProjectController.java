package com.dojo.student.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String index(Model model, HttpSession session) {
		List<Project> projects=this.pService.allProject();
		model.addAttribute("projects",projects);
		Long loggedInId=(Long)session.getAttribute("userId");
		Student student=sService.findStudent(loggedInId); 
		System.out.println(student.getFirstName());
		model.addAttribute("loogedIn",student.getFirstName());
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
	
//	Login
	//projects/login
	@GetMapping("/projects/login/{id}")
	public String login(@PathVariable("id") Long id, HttpSession session) {
		session.setAttribute("userId", id);
		
		return "redirect:/projects";
	}
	
	@GetMapping("/projects/like/{id}")
	public String like(@PathVariable("id") Long id, HttpSession session) {
		Long studentId=(Long)session.getAttribute("userId");
		Student student=sService.findStudent(studentId);
		Project project=pService.getOneProject(id);
		pService.likeProject(project, student);
		return "redirect:/projects";
	}


}
