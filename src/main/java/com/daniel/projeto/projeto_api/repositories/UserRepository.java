package com.daniel.projeto.projeto_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.projeto.projeto_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    
}