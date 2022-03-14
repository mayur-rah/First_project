package com.lti.demos;

public class Customer {

	private int custNo;
	private String custName;
	private double billAmt;
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
	public Customer(int custNo, String custName, double billAmt) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.billAmt = billAmt;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", billAmt=" + billAmt + "]";
	}
	
}

