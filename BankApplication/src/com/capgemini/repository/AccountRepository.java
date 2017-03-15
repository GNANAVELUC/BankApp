package com.capgemini.repository;

import com.capgemini.model.Account;

public interface AccountRepository {
	
	boolean save(Account account);
	
	boolean searchAccount(Account account);

}
