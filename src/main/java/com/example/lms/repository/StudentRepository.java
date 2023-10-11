package com.example.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.lms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query(value = "select*from student where roll_number like ?", nativeQuery = true)
	public Student getByRoll(int d);
}
