package com.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	List<Customer> findByLastName(String lastName);
}
