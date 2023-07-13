package com.oliveira.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
