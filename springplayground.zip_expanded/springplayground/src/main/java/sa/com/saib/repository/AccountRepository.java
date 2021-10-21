package sa.com.saib.repository;

import org.springframework.stereotype.Repository;

import sa.com.saib.models.Account;

@Repository
public class AccountRepository {
	
	
	
	public String addAccount(Account a)
	{
		System.out.println("In Repository");
		AccountDataHolder.getAccounts().add(a);
		
		System.out.println(AccountDataHolder.getAccounts());
		return "SUCCESS";
	}

}
