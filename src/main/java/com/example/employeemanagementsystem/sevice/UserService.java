package com.example.employeemanagementsystem.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.controller.UserRepo;
import com.example.employeemanagementsystem.entity.UserEntity;

@Service
public class UserService
{
	@Autowired
	UserRepo repo;
	
	  public String addUser(UserEntity user) 
	  {
		  if(user == null || user.getUserName() == null || user.getPassword() == null) {
			  return "enter proper values";
		  }
		  if (repo.findByUserName(user.getUserName()) != null) {
		        return "User already exists";
		    }
		 
		  repo.save(user);
		  
		  return "signup successfully ";
	  }
	  
      public String loginUser(String name,String password) {
    	  
    	  if(name == null || password ==  null || repo.findByUserName(name) == null) {
    		  return "user not found";
    	  }
    	    if(repo.findByUserName(name).getPassword().equals(password)) {
    	    	return "login succesfuly completed";
    	    }
    	  
    	    return "failed to login(incorrect username or password";
      }
}
