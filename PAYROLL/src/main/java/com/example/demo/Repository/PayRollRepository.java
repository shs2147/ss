package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.PayRoll;

public interface PayRollRepository extends JpaRepository<PayRoll,Integer>
	{


	}
