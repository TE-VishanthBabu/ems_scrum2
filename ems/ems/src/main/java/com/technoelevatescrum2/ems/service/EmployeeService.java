package com.technoelevatescrum2.ems.service;

import com.technoelevatescrum2.ems.beans.EmployeeAdd;
import com.technoelevatescrum2.ems.beans.EmployeeInfo;

public interface EmployeeService {

	public EmployeeInfo register(EmployeeInfo info);
	
	public EmployeeAdd add(EmployeeAdd info1);
}
