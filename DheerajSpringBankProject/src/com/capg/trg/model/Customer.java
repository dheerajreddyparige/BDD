package com.capg.trg.model;

import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.sun.istack.internal.NotNull;

@Component
public class Customer {
	private int customerid = (int) ((Math.random() * 100) + 1000);
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateofbirth;
	@NotNull
	private int balance = 0;
	@NotNull
	int pin = (int) ((Math.random() * 100));
	int accountnumber = (int) ((Math.random() * 40000) + 1000);
	@Size(min=3, max=45, message="Name should be min 3 and max 45 characters")
	@Pattern(regexp="",message="Enter address in format :Abc")
	String name;
	@Pattern(regexp="",message="Enter address in format :Abc")
	String address;
	@Pattern(regexp="",message="Enter 10 digit phonenumber")
	String phonenumber;
	@Pattern(regexp="[A-Za-z0-9]+@[A-Za-z0-9.-]+[.][A-Za-z]{2,4}", message="Invalid Email Address")
	String email;
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(int customerid, Date dateofbirth, int balance, int pin,
			int accountnumber, String name, String address, String phonenumber,
			String email) {
		super();
		this.customerid = customerid;
		this.dateofbirth = dateofbirth;
		this.balance = balance;
		this.pin = pin;
		this.accountnumber = accountnumber;
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", dateofbirth="
				+ dateofbirth + ", balance=" + balance + ", pin=" + pin
				+ ", accountnumber=" + accountnumber + ", name=" + name
				+ ", address=" + address + ", phonenumber=" + phonenumber
				+ ", email=" + email + "]";
	}
	
}
