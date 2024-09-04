package com.example.employeemanagementsystem.sevice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.controller.DepartmentRepo;
import com.example.employeemanagementsystem.controller.EmployeeRepo;
import com.example.employeemanagementsystem.entity.Department;
import com.example.employeemanagementsystem.entity.Employee;

@Service
public class EmployeeService
{
	@Autowired
    EmployeeRepo repo;
	
	@Autowired
	DepartmentRepo drepo;
	
	  public void addEmployees(Employee employee) {
		  
		  Department department = drepo.findById(employee.getDepartment().getDepartment_id())
				  .orElse(null);
		  employee.setDepartment(department);
		  repo.save(employee);
	  }
	  
	  public List<Employee> getAllEmployees() {
		  
		  List<Employee> employees = repo.findAll();
		  
		  return employees;
	  }
	  
	  public Employee getBy(int id) {
		  Employee employee = repo.findById(id).orElse(null);
		  
		  return employee;
	  }
	  
	  @Transactional
	  public String updateEmployeeName(String name,Integer id) {
		  
		 repo.updateByName(name, id);
		 
		 return "employee data updated succesfully";
		  
	  }
	  
	  @Transactional
	  public void deleteEmployee(Integer id) {
		  
		  repo.deleteById(id);
	  }
	  
	 
}
