package com.capg.trg.dao;

import com.capg.trg.exception.CustomerException;
import com.capg.trg.model.Customer;
import com.capg.trg.model.CustomerEntity;

public interface IBankDao {

	abstract public String CreateAccount(CustomerEntity customerEntity) throws CustomerException;

	//public List<Transaction> PrintTransactions(int customerid) throws CustomerException;

	public boolean ShowBalance(int customerid, int pin)
			throws CustomerException;

	public Customer displayCustomer(int cid) throws CustomerException;

	
	

	Customer FundTransfer(Customer bal, Customer bal1) throws CustomerException;

	Customer Deposit(Customer disp/* Transaction trans*/) throws CustomerException;

	Customer Withdraw(Customer disp/* Transaction trans*/)
			throws CustomerException;

}
