package com.example.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.entity.Department;
import com.example.employeemanagementsystem.sevice.DepartmentService;

@RestController
public class DepartmentController 
{
	@Autowired
	DepartmentService sevice;
	
	@PostMapping("/departments")
   public String addDepartmentDetails(@RequestBody Department department) {
	     
	   sevice.addDeparatments(department);
	   System.out.println(department);
	   return "data is inserted inyour department table";
   }
	@PutMapping("/updateEmployee/{id}/{name}") 
	public String update(@PathVariable int id,@PathVariable String name) {
		
	  sevice.updateName(id, name);
		return "data is updated in your data base";
	}
}
