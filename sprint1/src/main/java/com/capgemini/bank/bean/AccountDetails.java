package com.capgemini.bank.bean;

public class AccountDetails
{
	private String accountType;//
	private Double balance;
	private String accountNumber;
	private String accountStatus;

	public AccountDetails() 
	{
		super();
	}
	public String getAccountType() 
	{
		return accountType;
	}
	public void setAccountType(String accountType) 
	{
		this.accountType = accountType;
	}
	public Double getBalance() 
	{
		return balance;
	}
	public void setBalance(Double balance) 
	{
		this.balance = balance;
	}
	public String getAccountNumber() 
	{
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	public String getaccountStatus() 
	{
		return accountStatus;
	}
	public void setaccountStatus(String accountStatus) 
	{
		this.accountStatus = accountStatus;
	}
	public AccountDetails(String accountType, Double balance, String accountNumber, String accountStatus) 
	{
		super();
		this.accountType = accountType;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.accountStatus = accountStatus;
	}
	public String toString() 
	{
		return "AccountDetails [accountType=" + accountType + ", balance=" + balance + ", accountNumber=" + accountNumber + ", accountStatus=" + accountStatus + "]";
	}

}
