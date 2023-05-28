package com.example.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBoot.model.Address;
import com.example.springBoot.model.Customer;
import com.example.springBoot.model.Product;
import com.example.springBoot.repository.AddressRepository;
import com.example.springBoot.repository.CustomerRepository;
import com.example.springBoot.repository.ProductRepository;
import com.example.springBoot.service.OrderRequest;

@RestController
public class OrderController {
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private CustomerRepository customerrepo;

	@Autowired
	private ProductRepository productrepo;
	
	@PostMapping("/placeorder")
	public Customer placeOrder(@RequestBody OrderRequest req) {
		return customerrepo.save(req.getCustomer());
	}
	
	@GetMapping("/findallcustomer")
	public List<Customer> findAllCustomer(){
		return customerrepo.findAll();
	}
	@GetMapping("/findproduct/{name}")
	public Product findProduct(@PathVariable("name") String name){
		return productrepo.findByName(name);	
	}
	
	@GetMapping("/address")
	public List<Address> getAllAddress(){
		return addressRepo.findAll();
	}
	
	
	
}
