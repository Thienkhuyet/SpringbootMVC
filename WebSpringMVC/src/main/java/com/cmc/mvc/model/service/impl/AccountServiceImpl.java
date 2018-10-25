package com.cmc.mvc.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cmc.mvc.model.bean.Account;
import com.cmc.mvc.model.repository.AccountRepository;
import com.cmc.mvc.model.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}

	@Override
	public Account saveAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public void deleteAccount(int accountID) {
		accountRepository.deleteById(accountID);
		
	}

	@Override
	public Account getAccount(int accointID) {
		return accountRepository.getOne(accointID);
	}

	@Override
	public boolean getLogin(String email, String password) {
		// TODO Auto-generated method stub
		if(null!=accountRepository.getAccountl(email, password))return true;
		return false;
	}

	
	
	
	
	
}
