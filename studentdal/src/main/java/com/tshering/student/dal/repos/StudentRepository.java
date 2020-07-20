package com.tshering.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.tshering.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
