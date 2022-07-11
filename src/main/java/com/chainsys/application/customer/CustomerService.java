package com.chainsys.application.customer;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {
	@GetMapping("/findcustomer")
	public String getCustomer()
	{
		return "Hello Customer";
	}
	@PostMapping("/addcustomer")
	public int addNewCustomer()
	{
		return 0;
	}
	@PutMapping("/updatecustomer")
	public int updateCustomer()
	{
		return 0;
	}
	@DeleteMapping("/deletecustomer")
	public int deleteCustomer()
	{
		return 0;
	}
}
