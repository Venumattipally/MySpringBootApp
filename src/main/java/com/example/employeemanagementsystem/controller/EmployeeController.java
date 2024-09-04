package com.example.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.sevice.EmployeeService;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeService service;
   
	@PostMapping("/employees")
	public String addEmployees(@RequestBody Employee employee) {
		service.addEmployees(employee);
		return "employee details are inserted in your database";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		return service.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id) {
		return service.getBy(id);
	}
	
	@PutMapping("update/{id}/{name}") 
	public String update(@PathVariable("id")Integer id ,@PathVariable("name") String name) {
		
		return service.updateEmployeeName(name, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		service.deleteEmployee(id);
		return "deleted employee data based on id";
	}
}
