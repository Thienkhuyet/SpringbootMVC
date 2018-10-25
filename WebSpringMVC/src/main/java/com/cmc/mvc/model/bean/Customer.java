package com.cmc.mvc.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerID;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String note;

	public Customer() {
		super();
	}

	public Customer(String name, String phone, String email, String address, String note) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.note = note;
	}

	public Customer(int customerID, String name, String phone, String email, String address, String note) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.note = note;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
