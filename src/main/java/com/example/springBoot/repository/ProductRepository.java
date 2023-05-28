package com.example.springBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.springBoot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(nativeQuery = true,value = "Select * from Product where product_name = :name")
	public Product findByName(@Param("name") String
			name);
}
