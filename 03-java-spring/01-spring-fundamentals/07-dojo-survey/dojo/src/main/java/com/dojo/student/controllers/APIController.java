package com.dojo.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.student.models.Student;
import com.dojo.student.repositories.StudentRepository;
import com.dojo.student.services.StudentService;

@RestController
public class APIController {
	@Autowired
	private StudentService sService;
	
	@GetMapping("/students")
	private List<Student> getStudents() {
		return this.sService.allStudents();
	}
	
	@GetMapping("/students/{id}")
	private Student getOneStudents(@PathVariable("id") Long id) {
		return this.sService.findStudent(id);
	}
	
	

}
