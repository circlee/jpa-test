package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.domain.CustomerManager;
import com.sample.domain.CustomerManagerId;

public interface CustomerManagerRepository extends JpaRepository<CustomerManager, CustomerManagerId>{

	public void deleteByCustomerId(Long customerId);
}
