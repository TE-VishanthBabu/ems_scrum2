package com.technoelevatescrum2.ems.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "ems_reg")
public class EmployeeInfo implements Serializable{


	@Id
	@Column(name = "Email_address")
	private String email;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Username")
	private String userName;
	
	
	
	@Column(name = "Password")
	private String password;
}
