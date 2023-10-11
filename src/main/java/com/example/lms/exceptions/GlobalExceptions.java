package com.example.lms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptions {
	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object> ageHandler(AgeNotFoundException a1) {
		return new ResponseEntity<>(a1.getMessage(), HttpStatus.NOT_FOUND);
	}
}
