package com.technoelevatescrum2.ems.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevatescrum2.ems.beans.EmployeeAdd;
import com.technoelevatescrum2.ems.beans.EmployeeInfo;
import com.technoelevatescrum2.ems.dao.EmpAddDao;
import com.technoelevatescrum2.ems.dao.EmployeeDao;
import com.technoelevatescrum2.ems.exception.RegisterException;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Autowired
	private EmpAddDao ad;
	
	@Override
	@Transactional
	public EmployeeInfo register(EmployeeInfo info) {
		if(info != null) {
			return dao.save(info);
		}
		throw new RegisterException("User Already Exist");
	}

	@Override
	@Transactional
	public EmployeeAdd add(EmployeeAdd info1) {
		if(info1!=null) {
			return ad.save(info1);
		}
		throw new RegisterException("Data should not be empty");
	}

}
