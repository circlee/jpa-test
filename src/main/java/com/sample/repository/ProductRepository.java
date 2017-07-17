package com.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findByLastName(String lastName);
}
