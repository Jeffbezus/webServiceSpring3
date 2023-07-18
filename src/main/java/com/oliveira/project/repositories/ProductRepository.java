package com.oliveira.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
