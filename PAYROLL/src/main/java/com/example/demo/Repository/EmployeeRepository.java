package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
