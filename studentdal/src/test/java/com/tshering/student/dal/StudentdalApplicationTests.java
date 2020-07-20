package com.tshering.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tshering.student.dal.entities.Student;
import com.tshering.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Mindy");
		student.setCourse("Java");
		student.setFee(10.99);
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		Student student = studentRepository.findById(1L).get();
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Student student = studentRepository.findById(1L).get();
		student.setFee(40d);
		
		studentRepository.save(student);
	}
	
	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);
	}

}
