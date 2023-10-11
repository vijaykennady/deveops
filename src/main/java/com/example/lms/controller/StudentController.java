package com.example.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lms.entity.Student;
import com.example.lms.exceptions.AgeNotFoundException;
import com.example.lms.service.StudentService;

@RestController
@RequestMapping(value = "/studentDetails")
public class StudentController {
	@Autowired
	StudentService stuser;

	@PostMapping(value = "/insertDetails")
	public String insertDetails(@RequestBody Student a) throws AgeNotFoundException {
		return stuser.insertDetails(a);
	}

	@GetMapping(value = "/getById/{id}")
	public Student getById(@PathVariable int id) {
		return stuser.getById(id);
	}

	@PostMapping(value = "/updateDetails")
	public Student updateDetails(@RequestBody Student b) throws AgeNotFoundException {
		return stuser.updateDetails(b);
	}

	@DeleteMapping(value = "/deleteDetails/{id}")
	public int deleteDetails(@PathVariable int id) {
		return stuser.deleteDetails(id);
	}

	@GetMapping(value = "/findAll")
	public List<Student> findAll() {
		return stuser.findAll();
	}

	@GetMapping(value = "/getB/{d}")
	public Student getByRoll(@PathVariable int d) {
		return stuser.getByRoll(d);
	}

}
