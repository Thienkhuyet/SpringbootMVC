package com.cmc.mvc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cmc.mvc.model.bean.Account;


public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	@Query(value="SELECT *  FROM account a where a.email= ?1 and a.password= ?2",nativeQuery=true)
	public Account getAccountl(String email,String password);
	
	
}
