package com.example.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springBoot.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
