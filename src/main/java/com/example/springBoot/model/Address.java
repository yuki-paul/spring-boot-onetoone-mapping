package com.example.springBoot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int add_id;
	
	private String add1;
	
	private String add2;
	
	private String city;
	
	private int pincode;
	
//	in order to avoid infinite recursion 
//	we have giving json ignore in 
//	address side
	
	
	@OneToOne(mappedBy = "address")
	@JsonIgnore
	private Customer customer;

	public Address(String add1, String add2, String city, int pincode, Customer customer) {
		super();
		this.add1 = add1;
		this.add2 = add2;
		this.city = city;
		this.pincode = pincode;
		this.customer = customer;
	}

	public Address() {
		super();
	}

	public int getAdd_id() {
		return add_id;
	}

	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
}
