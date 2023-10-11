package com.example.lms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.lms.entity.Student;
import com.example.lms.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sturepo;

	public String inserDetails(Student a) {
		sturepo.save(a);
		return "Student details has been updated succesfully";
	}

	public Student getById(int id) {
		return sturepo.findById(id).get();
	}

	public Student updateDetails(Student b) {
		return sturepo.save(b);
	}

	public int deleteDetails(int id) {
		sturepo.deleteById(id);
		return 0;
	}

	public List<Student> findAll() {
		return sturepo.findAll();
	}

	public Student getByRoll(int d) {
		return sturepo.getByRoll(d);
	}

}
