package com.cmc.mvc.model.service;

import java.util.List;
import com.cmc.mvc.model.bean.Customer;

public interface CustomerService{
	List<Customer> getCustomers();
	Customer saveCustomer(Customer customer);
	void deleteCustomer(int customerID);
	Customer getCustomer(int customerID);
}
