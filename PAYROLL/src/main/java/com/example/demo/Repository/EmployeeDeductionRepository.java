package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.EmployeeDeduction;

public interface EmployeeDeductionRepository extends JpaRepository<EmployeeDeduction, Integer>{

}
