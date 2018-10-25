package com.cmc.mvc.model.service;

import java.util.List;
import com.cmc.mvc.model.bean.Account;

public interface AccountService {
	List<Account> getAccounts();

	Account saveAccount(Account account);

	void deleteAccount(int accountID);

	Account getAccount(int accointID);
	
	boolean getLogin(String email, String password);
}
