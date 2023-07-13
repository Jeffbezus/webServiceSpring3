package com.oliveira.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
