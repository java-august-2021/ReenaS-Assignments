package com.dojo.student.controllers;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dojo.student.models.Student;
import com.dojo.student.services.StudentService;


@Controller
public class HomeController {
	@Autowired
	private StudentService sService;
	
	// Create a @ModelAttribute and pass it in jsp	
	@GetMapping("/")
	public String index(@ModelAttribute("newStudent") Student student) {
		return "index.jsp";
	}
	
	//Create student 
	@PostMapping("/create")
	public String create(@ModelAttribute("newStudent") Student student) {
		Student newStudent= sService.createStudent(student);
		return "redirect:/welcome";
		
	}
	//List All students
	@GetMapping("/welcome")
	public String welcome(Model model) {
	  List<Student> students=this.sService.allStudents();
	  model.addAttribute("students",students);
	 return "welcome.jsp";
	}
	
	//Delete a student 
	 @DeleteMapping("/delete/{id}")
		private String deleteStudent(@PathVariable("id") Long id) {
			 sService.deleteStudent(id);
			 return "redirect:/welcome";
		}
	 
	//Get one student details
	  @GetMapping("/show/{id}")
	  private String getOneStudent(@PathVariable("id") Long id, Model model) 
	  { 
		  Student student=this.sService.findStudent(id);
		  model.addAttribute("student",student);
		  return "stack.jsp";
	}
	
	@PostMapping("/welcomeOld")
	public String welcomeOld(@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			Model userModel,
			HttpSession session) {
		userModel.addAttribute("firstName",firstName);
		userModel.addAttribute("lastName",lastName);
		userModel.addAttribute("email",email);
		/*
		 * Student newStudent=new Student(); newStudent.setFirstName(firstName);
		 * sService.createStudent(newStudent);
		 */
		return "welcome.jsp";
	}
	
	@GetMapping("/stack")
	public String stack() {
		return "stack.jsp";
	}


}
