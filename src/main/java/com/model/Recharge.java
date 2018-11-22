package com.model;

public class Recharge {

	private long phoneNo;
	private int amount;
	private String operator;
	
	public Recharge() {
	}

	public Recharge(long phoneNo, int amount, String operator) {
		super();
		this.phoneNo = phoneNo;
		this.amount = amount;
		this.operator = operator;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
	
}
