package com.bercoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bercoder.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}