package sa.com.saib.repository;

import java.util.ArrayList;
import java.util.List;

import sa.com.saib.models.Account;

public class AccountDataHolder {
	
	static List<Account> accounts=new ArrayList<>();

	public static List<Account> getAccounts() {
		return accounts;
	}

	
	
	
}
