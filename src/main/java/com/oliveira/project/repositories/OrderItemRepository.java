package com.oliveira.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
