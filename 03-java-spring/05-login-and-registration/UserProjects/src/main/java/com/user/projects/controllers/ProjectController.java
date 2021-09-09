package com.user.projects.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.user.projects.models.Project;
import com.user.projects.models.User;
import com.user.projects.services.ProjectService;
import com.user.projects.services.UserService;

@Controller
public class ProjectController {
	@Autowired
	private ProjectService pService;
	@Autowired
	private UserService uService;

	// Project Dashboard
	@GetMapping("/projects")
	public String projects(Model model, HttpSession session) {
		if (session.getAttribute("userId") != null) {
			List<Project> projects = this.pService.allProjects();
			User user = uService.findUserById((Long) session.getAttribute("userId"));
			model.addAttribute("projects", projects);
			model.addAttribute("user", user);
			return "/projects/projects.jsp";
		}
		return "redirect:/";
	}

	// New Project Page
	@GetMapping("/projects/new")
	public String index(@ModelAttribute("newProject") Project project, Model model, HttpSession session) {
		//Get User from session and pass it in model
		model.addAttribute("userId",(Long)session.getAttribute("userId"));
		
		return "/projects/new.jsp";
	}

	// Create Project
	@PostMapping("/projects/create")
	public String create(@Valid @ModelAttribute("newProject") Project project, BindingResult result) {
		if (result.hasErrors()) {
			return "/projects/new.jsp";
		} else {
			Project newProject = pService.createProject(project);
			return "redirect:/projects";
		}
	}

	// Delete Project
	@GetMapping("/projects/delete/{id}")
	private String deleteProject(@PathVariable("id") Long id) {
		pService.deleteProject(id);
		return "redirect:/projects";
	}

	// Edit- Page
	@GetMapping("/projects/edit/{id}")
	public String edit(@PathVariable("id") Long id, @ModelAttribute("editedProject") Project project, Model model,
			HttpSession session) {
		Project editProject = pService.getOneProject(id);
		model.addAttribute("editProject", editProject);
		return "projects/edit.jsp";
	}

	// Update project
	@PostMapping("/projects/update/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("editedProject") Project project,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			Project editProject = pService.getOneProject(id);
			model.addAttribute("editProject", editProject);
			return "projects/edit.jsp";
		} else {
			Project newProject = pService.updateProject(id, project.getProjectName(), project.getDescription());
			return "redirect:/projects";

		}
	}

	// Get project details
	@GetMapping("/projects/project/{id}")
	public String project(@PathVariable("id") Long projectId, Model model, HttpSession session) {
		Project project = pService.getOneProject(projectId);
		model.addAttribute("project", project);
		model.addAttribute("userLoggedIn", (Long) session.getAttribute("userId"));
		return "projects/project.jsp";
	}

	// Like Project
	@GetMapping("/projects/like/{projectId}")
	public String Like(@PathVariable("projectId") Long projectId, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		User user = uService.findUserById(userId);
		Project project = pService.getOneProject(projectId);
		pService.likeProject(project, user);
		return "redirect:/projects";
	}
	// Unlike Project
	@GetMapping("/projects/unLike/{projectId}")
	public String unLike(@PathVariable("projectId") Long projectId, HttpSession session) {
		//Unlike Project- logic
		Long userId = (Long) session.getAttribute("userId");
		User user = uService.findUserById(userId);
		Project project = pService.getOneProject(projectId);
		pService.unLikeProject(project, user);
		return "redirect:/projects";
	}

}
