package com.capg.trg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Repository;
import com.capg.trg.exception.CustomerException;
import com.capg.trg.model.Customer;
import com.capg.trg.model.CustomerEntity;
@Repository

public class BankDao implements IBankDao {
	//Transaction transaction=new Transaction();
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public String CreateAccount(CustomerEntity b) throws CustomerException {
	

		try {
			System.out.println(b);
			entityManager.persist(b);

		return "Account Created";
		} catch (PersistenceException e) {
			e.printStackTrace();
			
			// TODO: Log to file
			throw new CustomerException("Account not created");
		} 

		}

	
	@Override
	public Customer Withdraw(Customer disp/*, Transaction trans*/) throws CustomerException {
		
		try {

			
			//em1.persist(trans);
			entityManager.merge(disp);
			

			
		} catch (PersistenceException e) {
			
			throw new CustomerException("Unable to merge in table");
		} 
		
		return disp;
	}

	@Override
	public Customer FundTransfer(Customer bal, Customer bal1)
			throws CustomerException {
		
		try {

			

			entityManager.merge(bal);
			entityManager.merge(bal1);
			

			
		} catch (PersistenceException e) {
			e.printStackTrace();
			// TODO: Log to file
			throw new CustomerException(e.getMessage());
		
		}
		return bal;
	}

	/*@Override
	public List<com.capg.bean.Transaction> PrintTransactions(int customerid) throws CustomerException {
		EntityManager em=factory.createEntityManager();
		try{
			Customer c=em.find(Customer.class, customerid);
			List<Transaction> passbookList=c.getTransactions();
			 return passbookList;
		}catch(PersistenceException e) {
			e.printStackTrace();
			//TODO: Log to file
			throw new CustomerException(e.getMessage());
		}finally {
			em.close();
		}
	}
*/
	@Override
	public Customer displayCustomer(int cid) throws CustomerException {
		
		Customer customer = null;
		try {
			

			customer = entityManager.find(Customer.class, cid);
			//entityManager.getTransaction()
		} catch (PersistenceException e) {
			throw new CustomerException("Customer not found");
		} 

		return customer;

	}

	@Override
	public Customer Deposit(Customer disp/*,Transaction trans*/) throws CustomerException {
	
		try {

			
			//em1.persist(trans);
			entityManager.merge(disp);

			
		} catch (PersistenceException e) {
			e.printStackTrace();
			// TODO: Log to file
			throw new CustomerException(e.getMessage());
		} 
		return disp;
	}

	@Override
	public boolean ShowBalance(int customerid, int pin)
			throws CustomerException {
		// TODO Auto-generated method stub
		return true;
	}

}
