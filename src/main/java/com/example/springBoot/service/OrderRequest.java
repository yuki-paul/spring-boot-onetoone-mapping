package com.example.springBoot.service;

import com.example.springBoot.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class OrderRequest {

	private Customer customer;

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public OrderRequest() {
		super();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
