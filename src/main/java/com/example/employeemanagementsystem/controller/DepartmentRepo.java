package com.example.employeemanagementsystem.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.employeemanagementsystem.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department,Integer>{
     
	@Modifying
	@Query("update Department d SET d.name = :name where d.department_id=:id")
	void updateDepartmentName(@Param("id") Integer department_id,@Param("name") String name);
}
