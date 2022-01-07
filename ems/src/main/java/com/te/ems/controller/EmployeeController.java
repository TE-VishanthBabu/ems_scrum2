package com.te.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.ems.beans.EmployeeInfo;
import com.te.ems.beans.EmployeeResponse;
import com.te.ems.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping(path = "/login")
	public ResponseEntity<EmployeeResponse> login(@RequestBody EmployeeInfo login) {
		EmployeeResponse response = new EmployeeResponse(false, service.login(login.getEmail(), login.getPassword()));
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);
	}

}
