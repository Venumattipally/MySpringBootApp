package com.example.employeemanagementsystem.sevice;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagementsystem.controller.DepartmentRepo;
import com.example.employeemanagementsystem.entity.Department;

@Service
public class DepartmentService 
{
   @Autowired
   DepartmentRepo repo;   
   
   public void addDeparatments(Department department) {
	   
	   repo.save(department);
   }
   
   @Transactional
   public void updateName(Integer department_id,String name) {
	    
	 
	repo.updateDepartmentName(department_id, name);
   }
}
