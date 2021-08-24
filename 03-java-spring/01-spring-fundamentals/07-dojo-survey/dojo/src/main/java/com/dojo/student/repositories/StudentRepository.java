package com.dojo.student.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.student.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

// Create
// Read
// Update
// Delete
	List<Student> findAll();
	
	
}
