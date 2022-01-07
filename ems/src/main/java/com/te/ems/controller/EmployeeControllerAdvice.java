package com.te.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.te.ems.beans.EmployeeResponse;
import com.te.ems.exception.RegisterException;

@ControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(RegisterException.class)
	public ResponseEntity<EmployeeResponse> registerException(RegisterException reg) {
		EmployeeResponse response = new EmployeeResponse(true, reg.getMessage());
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<EmployeeResponse> methodArgumentNotValidException(MethodArgumentNotValidException exp) {
		EmployeeResponse res = new EmployeeResponse(true, exp.getFieldError().getDefaultMessage());
		return new ResponseEntity<>(res, HttpStatus.NOT_FOUND);
	}

}
