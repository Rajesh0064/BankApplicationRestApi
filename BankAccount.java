package com.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankAccount {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountNumber;
	private String accountName;
	private String password;
	private double amount;
	private String address;
	private long mobileNumber;
	public BankAccount() {
		super();
	}
	public BankAccount(long accountNumber, String accountName, String password, double amount, String address,
			long mobileNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.password = password;
		this.amount = amount;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", password=" + password
				+ ", amount=" + amount + ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
