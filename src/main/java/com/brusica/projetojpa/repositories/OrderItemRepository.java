package com.brusica.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusica.projetojpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
