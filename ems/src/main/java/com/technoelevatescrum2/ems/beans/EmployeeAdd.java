package com.technoelevatescrum2.ems.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmpAdd")
public class EmployeeAdd implements Serializable{
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "Full_Name")
	private String name;
	
	
	@Column
	private String designation;
	
	@Column
	private Double salary;
	
	@Column
	private Integer age;

}
