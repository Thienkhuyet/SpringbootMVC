package com.cmc.mvc.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ACCOUNT")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountID;
	private String username;
	private String password;
	private String email;

	/**
	 * @description this is constructor
	 */
	public Account() {
		super();
	}

	/**
	 * @description this is constructor
	 * @param accountID
	 * @param username
	 * @param password
	 * @param email
	 */
	public Account(int accountID, String username, String password, String email) {
		super();
		this.accountID = accountID;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * @description this is constructor
	 * @param username
	 * @param password
	 * @param email
	 */
	public Account(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
