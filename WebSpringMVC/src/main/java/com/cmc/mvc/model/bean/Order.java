package com.cmc.mvc.model.bean;

import java.util.Date;

public class Order {
	private int orderID;
	private int customerID;
	private int carID;
	private int amount;
	private double salePrice;
	private Date orderDate;
	private Date deliveryDate;
	private String deliveryAddress;
	private int staus;
	private String note;
	public Order() {
		super();
		this.amount=1;
	}
	public Order(int customerID, int carID, int amount, double salePrice, Date orderDate, Date deliveryDate,
			String deliveryAddress, int staus, String note) {
		super();
		this.customerID = customerID;
		this.carID = carID;
		this.amount = amount;
		this.salePrice = salePrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryAddress = deliveryAddress;
		this.staus = staus;
		this.note = note;
	}
	public Order(int orderID, int customerID, int carID, int amount, double salePrice, Date orderDate,
			Date deliveryDate, String deliveryAddress, int staus, String note) {
		super();
		this.orderID = orderID;
		this.customerID = customerID;
		this.carID = carID;
		this.amount = amount;
		this.salePrice = salePrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryAddress = deliveryAddress;
		this.staus = staus;
		this.note = note;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getCarID() {
		return carID;
	}
	public void setCarID(int carID) {
		this.carID = carID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public int getStaus() {
		return staus;
	}
	public void setStaus(int staus) {
		this.staus = staus;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
