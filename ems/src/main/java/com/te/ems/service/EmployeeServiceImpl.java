package com.te.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ems.beans.EmployeeInfo;
import com.te.ems.dao.EmployeeDao;
import com.te.ems.exception.RegisterException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public EmployeeInfo login(String email, String password) {

		EmployeeInfo logg = dao.findByEmailAndPassword(email, password);
		if (logg != null) {
			return logg;
		} else {
			throw new RegisterException("Invalid Credentials");
		}

	}

}
