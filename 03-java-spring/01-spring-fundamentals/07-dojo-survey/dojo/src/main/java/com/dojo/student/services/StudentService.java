package com.dojo.student.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dojo.student.models.Student;
import com.dojo.student.repositories.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		
		this.studentRepository = studentRepository;
	}
	
	//List All students	
	public List<Student> allStudents() {
        return studentRepository.findAll();
    }
	
	//One Student Detail	
	public Student findStudent(Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	//Create New Student
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	//Delete a Student	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	
}
