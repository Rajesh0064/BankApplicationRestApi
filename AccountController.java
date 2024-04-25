package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.BankAccount;
import com.rest.service.AccountService;

@RestController
@CrossOrigin (origins = {"*"})
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/save")
	public String saveAccountDetails(@RequestBody BankAccount bankAccount)
	{
		BankAccount bankAccount1 = accountService.saveAccount(bankAccount);
		String message;
		if(bankAccount1 != null)
		{
			message = "DATA SAVED SUCCESSSFULLY";
		}
		else
		{
			message = "DATA FAILED";
		}
		return message;
	}
	
	@PostMapping("/get")
	public BankAccount getAccountDetails(@RequestBody BankAccount bankAccount)
	{
		BankAccount account = accountService.getBankDetails(bankAccount.getAccountNumber(),bankAccount.getAccountName(),bankAccount.getPassword());
		return account;
	}
	
	@PostMapping("/deposit")
	public BankAccount depositAccountDetails(@RequestBody BankAccount bankAccount)
	{
		BankAccount account = accountService.deposit(bankAccount.getAccountNumber(), bankAccount.getAccountName(), bankAccount.getPassword(),bankAccount.getAmount());
		return account;	
	}
	
	@PostMapping("/withdraw")
	public BankAccount withdrawlAccountDetails(@RequestBody BankAccount bankAccount)
	{
		BankAccount account = accountService.withdraw(bankAccount.getAccountNumber(), bankAccount.getAccountName(), bankAccount.getPassword(),bankAccount.getAmount());
		return account;
	}
	
	@PostMapping("/transfer/{accountNumber1}/{amount1}")
	public BankAccount transferAccountDetails(@RequestBody BankAccount bankAccount,@PathVariable long accountNumber1,@PathVariable double amount1)
	{
		
		BankAccount account = accountService.transfer(bankAccount.getAccountNumber(),bankAccount.getAccountName(),bankAccount.getPassword(), accountNumber1,amount1);
		return account;
	}
	
	@PostMapping("/close")
	public String closeAccountDetails(@RequestBody BankAccount bankAccount)
	{
		BankAccount account = accountService.closeAccount(bankAccount.getAccountNumber(), bankAccount.getAccountName(), bankAccount.getPassword());
		String message = null;
		if(account != null)
		{
			message =account.getAccountNumber()+" IS CLOSED ";
		}
		return message;
	}
	@DeleteMapping("/delete/{accountNumber}")
	public void deleteAccountDetails(@PathVariable long accountNumber)
	{
		accountService.deleteAccount(accountNumber); 
	}
	@PutMapping("/update/{accountNumber}")
	public BankAccount updateBankAccount(@RequestBody BankAccount bankAccount,@PathVariable long accountNumber)
	{
		BankAccount account = accountService.updateAccountDetails(bankAccount,accountNumber);
		return account;
	}
}
