package com.brusica.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusica.projetojpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
