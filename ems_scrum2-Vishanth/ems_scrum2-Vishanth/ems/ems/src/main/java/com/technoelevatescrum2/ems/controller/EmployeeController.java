package com.technoelevatescrum2.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevatescrum2.ems.beans.EmployeeAdd;
import com.technoelevatescrum2.ems.beans.EmployeeInfo;
import com.technoelevatescrum2.ems.beans.EmployeeResponse;
import com.technoelevatescrum2.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
	@PostMapping(path = "/register")
	public ResponseEntity<EmployeeResponse> storeData(@RequestBody EmployeeInfo info) {
		EmployeeResponse response = new EmployeeResponse(false, service.register(info));
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);

	}
	
	@PostMapping(path = "/add")
	public ResponseEntity<EmployeeResponse> addData(@RequestBody EmployeeAdd info1){
		EmployeeResponse response=new EmployeeResponse(false, service.add(info1));
		return new ResponseEntity<EmployeeResponse>(response,HttpStatus.OK);
		}
	
	@GetMapping(path ="/viewall")
	public ResponseEntity<EmployeeResponse> viewAll(){
		EmployeeResponse response = new EmployeeResponse(false, service.getdata());
		return new ResponseEntity<EmployeeResponse>(response, HttpStatus.OK);
	}
}
