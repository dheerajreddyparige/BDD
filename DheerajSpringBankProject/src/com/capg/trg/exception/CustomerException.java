package com.capg.trg.exception;

public class CustomerException extends Exception {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String status;
	
	public CustomerException() {
		this.status="Unable to perform CRUD on table";
	}
	
	public CustomerException(String status) {
		super(status);
	}
	
	public String getStatus() {
		return this.status;
	}

	public String toString() {
		return "CustomerException [status=" + status + "]";
	}

}