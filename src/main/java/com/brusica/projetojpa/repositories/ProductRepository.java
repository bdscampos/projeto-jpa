package com.brusica.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusica.projetojpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
