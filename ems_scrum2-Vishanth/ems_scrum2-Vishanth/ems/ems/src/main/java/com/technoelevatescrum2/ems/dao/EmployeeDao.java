package com.technoelevatescrum2.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technoelevatescrum2.ems.beans.EmployeeInfo;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeInfo, String>{

}
