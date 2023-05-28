package com.example.springBoot.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	
	private String custName;
	
	private String email;
	
	private String gender;
	
	@OneToMany( targetEntity = Product.class , cascade = CascadeType.ALL)
	@JoinColumn(name="cust_id_fk" , referencedColumnName = "custId" )
	private List<Product> products;
	
	//bidirectional mapping 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_add_id")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer( String custName, String email, String gender, List<Product> products,Address address) {
		super();
		this.custName = custName;
		this.email = email;
		this.gender = gender;
		this.products = products;
		this.address = address;
	}

	public Customer() {
		super();
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	
	
}
