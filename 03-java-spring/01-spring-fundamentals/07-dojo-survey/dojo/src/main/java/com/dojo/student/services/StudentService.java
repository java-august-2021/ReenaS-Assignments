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
	
	public List<Student> allStudents() {
        return studentRepository.findAll();
    }
	
	public Student findStudent(Long id) {
		return studentRepository.findById(id).orElse(null);
	}
	
}
