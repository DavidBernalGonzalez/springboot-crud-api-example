package com.eco.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eco.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Void save(Optional<Customer> customerToUpdate);
}