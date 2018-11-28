package com.capg.trg.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.trg.exception.CustomerException;
import com.capg.trg.model.Customer;
import com.capg.trg.service.IBankService;

@Controller
@RequestMapping(value = "/cust")
public class LoginController {
	@Autowired
	private IBankService customerService;

	@RequestMapping(value = "/eobj", method = RequestMethod.GET)
	public ModelAndView emptyobj() {
		return new ModelAndView("register", "customer", new Customer());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView addCustomer(
			@ModelAttribute(value = "customer") Customer customer,HttpServletRequest request) {
		// System.out.println(customer.getCustomerName());
		try {HttpSession session= request.getSession();
	
			int customerid = customer.getCustomerid();
			int acc = customer.getAccountnumber();
			int pin = customer.getPin();
			int balance = customer.getBalance();
			customer.setCustomerid(customerid);
			customer.setAccountnumber(acc);
			customer.setPin(pin);
			customer.setBalance(balance);
			session.setAttribute("customer", customer);
			String status = customerService.CreateAccount(customer);

			return new ModelAndView("cust_status", "message", status);
		} catch (CustomerException e) {
			return new ModelAndView("status", "message", e.getMessage());
		}
	}

	@RequestMapping(value = "/lobj", method = RequestMethod.GET)
	public ModelAndView viewLogin() {
		return new ModelAndView("login", "user", new Customer());
	}

	@RequestMapping(value = "/verify", method = RequestMethod.POST)
	public ModelAndView doLogin(@Valid @ModelAttribute("user") Customer user) {
		try {
			boolean correct1 = customerService.access(user.getCustomerid(),
					user.getPin());
			if (correct1) {
				return new ModelAndView("services", "message", "");
				//return new ModelAndView("withdraw", "withuser", user);
			}
		} catch (CustomerException e) {
			System.out.println(e.getMessage());

		}
		return new ModelAndView("status", "message",
				"Please enter correct details for login");
	}

	@RequestMapping(value = "/showbalance", method = RequestMethod.POST)
	public ModelAndView showbalance(@Valid @ModelAttribute("user") Customer user) {
		try {

			Customer disp = customerService.ShowBalance(user.getCustomerid(),
					user.getPin());
			if (disp != null) {
				return new ModelAndView("showbalance", "message",
						disp.getBalance());
			}
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	
	@RequestMapping(value = "/withdraw", method = RequestMethod.POST)
	public ModelAndView withdraw(HttpServletRequest request,@RequestParam("withdraw") int withdraw) {
		
		try{
			HttpSession session= request.getSession();
			Customer c=(Customer) session.getAttribute("customer");
			Customer disp2 = customerService.Withdraw(c.getCustomerid(), withdraw);
			
			if (disp2 != null) {
				return new ModelAndView("withdrawshow", "message", disp2);
				
			}
			}catch (CustomerException e) {

					System.out.println(e.getMessage());
				}
		return new ModelAndView("services", "message", "Uanble to withdraw check details correctly ");
		
			}

	
	@RequestMapping(value = "/deposit", method = RequestMethod.POST)
	public ModelAndView deposit(HttpServletRequest request,@RequestParam("deposit") int deposit) {
		
		try{
			HttpSession session= request.getSession();
			Customer c=(Customer) session.getAttribute("customer");
			Customer disp2 = customerService.Withdraw(c.getCustomerid(), deposit);
			
			if (disp2 != null) {
				return new ModelAndView("depositshow", "message", disp2);
				
			}
			}catch (CustomerException e) {

					System.out.println(e.getMessage());
				}
		return new ModelAndView("services", "message", "Uanble to deposit check details correctly ");
		
			}

	@RequestMapping(value = "/fundtransfer", method = RequestMethod.POST)
	public ModelAndView fundTransfer(HttpServletRequest request,@RequestParam("transferamount") int transferamount,@RequestParam("transferid") int transferid) {
		
		try{
			HttpSession session= request.getSession();
			Customer c=(Customer) session.getAttribute("customer");
			boolean disp2 = customerService.FundTransfer(c.getCustomerid(), transferid,transferamount);
			
			if (disp2) {
				return new ModelAndView("fundtransfershow", "message", "Amount is Transfered");
				
			}
			}catch (CustomerException e) {

					System.out.println(e.getMessage());
				}
		return new ModelAndView("services", "message", "Uanble to transfer check details correctly ");
		
			}
			
		}

