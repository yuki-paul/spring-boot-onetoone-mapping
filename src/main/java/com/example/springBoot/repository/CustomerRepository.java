package com.example.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
