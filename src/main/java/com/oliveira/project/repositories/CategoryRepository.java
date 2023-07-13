package com.oliveira.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
