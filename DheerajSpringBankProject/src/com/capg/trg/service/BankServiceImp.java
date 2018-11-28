package com.capg.trg.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.trg.dao.IBankDao;
import com.capg.trg.exception.CustomerException;
import com.capg.trg.exception.InvalidInputException;
import com.capg.trg.model.Customer;
import com.capg.trg.model.CustomerEntity;
@Service
public class BankServiceImp implements IBankService {
	@Autowired
	private IBankDao bankDao;
	//Transaction trans = new Transaction();

	@Override
	public String CreateAccount(Customer c) throws CustomerException {
	
		if(validation(c)) {			
			CustomerEntity customerEntity=new CustomerEntity();
		CustomerEntity b=	populateCustomerEntity(c,customerEntity);
		String status=bankDao.CreateAccount(b);
		return status;
		}else {return "invalid credentilas";}
		
	
		
		
	}
		private CustomerEntity populateCustomerEntity(Customer customer, CustomerEntity customerEntity) {
			customerEntity.setCustomerid(customer.getCustomerid());
			customerEntity.setName(customer.getName());
			customerEntity.setPhonenumber(customer.getPhonenumber());
			customerEntity.setAddress(customer.getAddress());
			customerEntity.setEmail(customer.getEmail());
			customerEntity.setDateofbirth(customer.getDateofbirth());
			return customerEntity;
		}

	public boolean validation(Customer bean) {
		boolean flag = false;
		if (isValidName(bean.getName()) && isValidaddress(bean.getAddress())
				&& isValidemail(bean.getEmail())
				&& isValidphonenumber(bean.getPhonenumber())
				&& isValiddob(bean.getDateofbirth())
				&& isValidcustomerid(bean.getCustomerid())) {
			flag = true;
		}
		return flag;
	}

	public boolean isValidName(String name) {
		if (((name != null) && name.matches("[A-Z][a-z]+"))) {
			return true;
		} else {
			throw new InvalidInputException(
					" : Name cannot be NULL (or) INVALID Name.");
		}
	}

	public boolean isValidaddress(String address) {
		if (((address != null) && address.matches("[A-Z][a-z]+"))) {
			return true;
		} else {
			throw new InvalidInputException(
					" : address cannot be NULL (or) INVALID address.");
		}
	}

	public boolean isValidemail(String email) {
		if (((email != null) && email
				.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))) {
			return true;
		} else {
			throw new InvalidInputException(
					" : email cannot be NULL (or) INVALID email.");
		}
	}

	public boolean isValidphonenumber(String phonenumber) {
		if (((phonenumber != null) && phonenumber.matches("[4-9][0-9]{9}"))) {
			return true;
		} else {
			throw new InvalidInputException(
					" : Name cannot be NULL (or) INVALID Name.");
		}
	}

	public boolean isValiddob(Date date) {
		if (((date != null))){
			return true;
		} else {
			throw new InvalidInputException(
					" : dob cannot be NULL (or) INVALID dob.");
		}
	}

	public boolean isValidcustomerid(int customerid) {
		if (customerid >= 100) {
			return true;
		} else {
			throw new InvalidInputException(
					" : customerid cannot be Null (or) INVALID Customer.");
		}
	}

	public boolean validAmount(int amount) {
		if (amount > 0) {
			return true;
		} else {
			throw new InvalidInputException(
					" : Invalid Amount. Please enter a POSITIVE amount. Thanks. :) \n");
		}
	}

	@Override
	public Customer ShowBalance(int customerid, int pin)
			throws CustomerException {

		Customer disp = displayCustomer(customerid);
		System.out.println(disp);
		int bal1 = 0;
		if (disp.getCustomerid() == customerid && disp.getPin() == pin) {
			bal1 = disp.getBalance();
		}
		return disp;
		// TODO Auto-generated method stub
	}

	@Override
	public Customer Deposit(int amount, int customerid1)
			throws CustomerException {
		Customer disp = displayCustomer(customerid1);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		int currbal = disp.getBalance() + amount;

		disp.setBalance(currbal);
		/*int s1 = trans.getTransactionid();
		trans.setTransactionid(s1);
		trans.setTransaction("TransactionId:"+s1+     "Date of Transaction" + dateFormat.format(date)  +     "Amount Deposited" + amount+     "Ur current Balance"+ currbal);

		//disp.addTransaction(trans);
		trans.setCustomer(disp);*/

		return bankDao.Deposit(disp);

	}

	@Override
	public Customer Withdraw(int withdraw, int customerid2)
			throws CustomerException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		Customer disp = displayCustomer(customerid2);
		if (disp.getBalance() - withdraw > 100) {
			int newwithdraw = disp.getBalance() - withdraw;

			disp.setBalance(newwithdraw);
			/*int s1 = trans.getTransactionid();
			trans.setTransactionid(s1);
			trans.setTransaction("TransactionId:" + s1+"                            "+ "Date of Transaction:"+ dateFormat.format(date) +"               "+ "Amount Withdrawn" + withdraw+"           "+ "Ur current Balance" + newwithdraw);

			 trans.setCustomer(disp);

			disp.addTransaction(trans);*/
			return bankDao.Withdraw(disp);

			
		} else {
			throw new CustomerException("U dont have sufficient amount to withdraw:amount should be in multiples of 100");
		}
		
	}

	@Override
	public boolean FundTransfer(int transferid, int transferamount,
			int customerid3) throws CustomerException {

		Customer bal = Deposit(transferamount, transferid);

		
		Customer bal1 = Withdraw(transferamount, customerid3);

	
		bankDao.FundTransfer(bal, bal1);

		return true;

	}

	/*@Override
	public List<Transaction> PrintTransactions(int customerid)
			throws CustomerException {

		return dao.PrintTransactions(customerid);
	}*/

	@Override
	public Customer displayCustomer(int cid) throws CustomerException {
		// TODO Auto-generated method stub
		return bankDao.displayCustomer(cid);
	}

	public boolean access(int customerid1, int pin1) throws CustomerException {
		Customer disp = displayCustomer(customerid1);
		
		boolean flag = false;
		if (disp.getCustomerid() == customerid1 && disp.getPin() == pin1) {
			{
				flag = true;
			}
		}
		return flag;
	}

}
