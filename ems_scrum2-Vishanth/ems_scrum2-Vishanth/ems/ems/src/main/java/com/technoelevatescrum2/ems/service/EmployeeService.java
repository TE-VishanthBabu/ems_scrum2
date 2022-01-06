package com.technoelevatescrum2.ems.service;

import java.util.List;

import com.technoelevatescrum2.ems.beans.EmployeeAdd;
import com.technoelevatescrum2.ems.beans.EmployeeInfo;

public interface EmployeeService {

	public EmployeeInfo register(EmployeeInfo info);
	
	public EmployeeAdd add(EmployeeAdd info1);
	
	public List<EmployeeAdd> getdata();
	
	public EmployeeAdd update(EmployeeAdd info);
	
}
