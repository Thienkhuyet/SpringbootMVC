package com.cmc.mvc.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmc.mvc.model.bean.Customer;
import com.cmc.mvc.model.repository.CustomerRepository;
import com.cmc.mvc.model.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(int customerID) {
		customerRepository.deleteById(customerID);
	}

	@Override
	public Customer getCustomer(int customerID) {
		return customerRepository.getOne(customerID);
	}

}
