package com.brusica.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusica.projetojpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
