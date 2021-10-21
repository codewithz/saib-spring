package sa.com.saib.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sa.com.saib.models.Account;
import sa.com.saib.services.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;

		@PostMapping("/accounts")
		public String addAccount(@RequestBody  Account a)
		{
			System.out.println("In Controller");
			System.out.println(a);
			String result=accountService.addAccount(a);
			return result;
			
		}
	
	
}
