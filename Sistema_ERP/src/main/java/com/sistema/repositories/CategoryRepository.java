package com.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
