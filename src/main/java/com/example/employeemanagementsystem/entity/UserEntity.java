package com.example.employeemanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="User_details")
public class UserEntity 
{
	
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee2_seq")
     @SequenceGenerator(name = "employee2_seq", sequenceName = "employee2_seq", allocationSize = 1)
 	
	 private Integer loginID;
     private String userName;
     private String password;
     
	public Integer getLoginID() {
		return loginID;
	}
	public void setLoginID(Integer loginID) {
		this.loginID = loginID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
     
}
