package com.example.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.entity.UserEntity;
import com.example.employeemanagementsystem.sevice.UserService;

@RestController
public class UserController {

	@Autowired
	UserService uservice;
	
	@PostMapping("/signUp")
	public String createUser(@RequestBody UserEntity user) {
	
		return uservice.addUser(user);
	}
	
	@PostMapping("/login")  
	public String check(@RequestParam String userName,@RequestParam String password) {
		
		return uservice.loginUser(userName, password);
	}
	
}
