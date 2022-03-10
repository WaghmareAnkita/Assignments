package com.assignment.five;

public class HomeLoan {

	private float loanPerc;
	private double loanAmount;
	private int loanDuration;
	private Person person;
	
	public HomeLoan(float loanPerc, double loanAmount, int loanDuration,String name,String city,long phone) {
		this.loanPerc=loanPerc;
		this.loanAmount=loanAmount;
		this.loanDuration=loanDuration;
		this.person=new Person(name,city,phone);
	}

	public float getLoanPerc() {
		return loanPerc;
	}

	public void setLoanPerc(float loanPerc) {
		this.loanPerc = loanPerc;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	
	public Person getPersonDetails() {
		return this.person;
	}
	
}
