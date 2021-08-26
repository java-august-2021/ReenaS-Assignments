package com.dojo.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.student.models.Student;
import com.dojo.student.services.StudentService;

@RestController
public class APIController {
	@Autowired
	private StudentService sService;
	
   //Get all students
	@GetMapping("/students")
	private List<Student> getStudents() {
		return this.sService.allStudents();
	}
	
	//Get one student details
	  @GetMapping("/students/{id}") private Student
	  getOneStudents(@PathVariable("id") Long id) 
	  { 
		  return this.sService.findStudent(id); 
	}
	  
	//Create a Student 
	  @PostMapping("/students/create")
		private Student create(Student student) {
			return sService.createStudent(student);
		}
	//Delete a Student   
	  @DeleteMapping("/students/delete/{id}")
		private void deleteStudent(@PathVariable("id") Long id) {
			 sService.deleteStudent(id);
		}
	
}
