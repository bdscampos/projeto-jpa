package com.brusica.projetojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brusica.projetojpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
