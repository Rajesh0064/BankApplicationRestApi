package com.rest.service;

import com.rest.model.BankAccount;

public interface AccountService {
	public BankAccount saveAccount(BankAccount bankAccount);
	public BankAccount depositTransfer(long toAccountNumber, double amount);
	public BankAccount getBankDetails(long accountNumber, String accountName, String password);
	public  BankAccount deposit(long accountNumber,String accountName,String password, double amount);
	public  BankAccount transfer(long accountNumber,String accountName,String password, long accountNumber1,double amount1);
	public BankAccount withdraw(long accountNumber, String accountName, String password, double amount);
	public BankAccount getTargAccountBankDetails(long targetAccountNumber);
	public BankAccount closeAccount(long accountNumber, String accountName, String password);
	public void deleteAccount(long accountNumber);
	public BankAccount updateAccountDetails(BankAccount bankAccount,long accountNumber);

}
