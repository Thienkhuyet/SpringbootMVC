package com.cmc.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.mvc.model.bean.Customer;
import com.cmc.mvc.model.service.CustomerService;

@RestController

public class APICustomer {
	@Autowired
	CustomerService customerS;
	  @GetMapping(value="/api",produces="application/json")
	  public List<Customer> APICus(){
		  
		  return customerS.getCustomers();
	  }
}
