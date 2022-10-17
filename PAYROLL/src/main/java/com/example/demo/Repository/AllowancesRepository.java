package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Allowances;

public interface AllowancesRepository extends JpaRepository<Allowances, Integer> {

}
