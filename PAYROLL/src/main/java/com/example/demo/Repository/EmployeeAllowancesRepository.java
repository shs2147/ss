package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.EmployeeAllowances;

public interface EmployeeAllowancesRepository extends JpaRepository<EmployeeAllowances, Integer> {

}
