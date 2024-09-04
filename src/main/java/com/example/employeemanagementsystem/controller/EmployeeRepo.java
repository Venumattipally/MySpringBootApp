package com.example.employeemanagementsystem.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.employeemanagementsystem.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	
	@Modifying
	@Query("update Employee e SET e.name  = :name where e.id = :id")
	void updateByName(@Param("name") String name,@Param("id") Integer id);

}
