package com.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.domain.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long>{

	List<Manager> findByLastName(String lastName);
}
