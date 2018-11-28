package com.capg.trg.service;

import com.capg.trg.exception.CustomerException;
import com.capg.trg.model.Customer;

public interface IBankService {
	
	public String CreateAccount(Customer c) throws CustomerException;
	public Customer ShowBalance(int customerid,int pin) throws CustomerException;
	public Customer Deposit(int amount,int customerid1) throws CustomerException;
	
	public Customer displayCustomer(int cid) throws CustomerException;
	Customer Withdraw(int withdraw, int customerid2) throws CustomerException;
	
	boolean FundTransfer(int transferid, int transferamount, int customerid3) throws CustomerException;
	public boolean access(int customerid, int pin)throws CustomerException;
	
	//public List<Transaction> PrintTransactions(int customerid) throws CustomerException;
	
	


	
	
	
	
}
