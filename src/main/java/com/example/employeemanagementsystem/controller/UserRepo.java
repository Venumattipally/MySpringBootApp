package com.example.employeemanagementsystem.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemanagementsystem.entity.UserEntity;

public interface UserRepo  extends JpaRepository<UserEntity,Integer >
{
    UserEntity findByUserName(String name);
}
