package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Deduction;

public interface DeductionRepository extends JpaRepository<Deduction, Integer> {

}
