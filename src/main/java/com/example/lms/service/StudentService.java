package com.example.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lms.dao.StudentDao;
import com.example.lms.entity.Student;
import com.example.lms.exceptions.AgeNotFoundException;

@Service
public class StudentService {
	@Autowired
	StudentDao studao;

	public String insertDetails(Student a) throws AgeNotFoundException {

		if (a.getAge() > 18) {
			return studao.inserDetails(a);
		} else {
			throw new AgeNotFoundException("Invalid Age");
		}
	}

	public Student getById(int id) {
		return studao.getById(id);
	}

	public Student updateDetails(Student b) {
		return studao.updateDetails(b);
	}

	public int deleteDetails(int id) {
		return studao.deleteDetails(id);
	}

	public List<Student> findAll() {
		return studao.findAll();
	}

	public Student getByRoll(int d) {
		return studao.getByRoll(d);
	}

}
