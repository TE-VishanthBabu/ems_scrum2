package com.te.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.ems.beans.EmployeeInfo;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeInfo, String>{

	public EmployeeInfo findByEmailAndPassword(String email, String password);


}
