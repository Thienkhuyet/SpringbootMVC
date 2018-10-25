package com.cmc.mvc.model.bean;

public class Car {
	private int carID;
	private String maker;
	private String model;
	private int year;
	private String color;
	private String note;

	public Car() {
		super();
	}

	public Car(String maker, String model, int year, String color, String note) {
		super();
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.color = color;
		this.note = note;
	}

	public Car(int carID, String maker, String model, int year, String color, String note) {
		super();
		this.carID = carID;
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.color = color;
		this.note = note;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
