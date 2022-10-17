package com.example.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Position;



public interface PositionRepository extends JpaRepository<Position, Integer> {

}
