package com.assignment.five;

public class PersonalLoan {
	private float loanPerc;
	private double loanAmount;
	private int loanDuration;
	private Person person;
	
	public PersonalLoan(float loanPerc, double loanAmount, int loanDuration,String name,String city,long phone) {
		this.loanPerc=loanPerc;
		this.loanAmount=loanAmount;
		this.loanDuration=loanDuration;
		this.person=new Person(name,city,phone);
	}
	
	public float getLoanPerc() {
		return loanPerc;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanPerc(float loanPerc) {
		this.loanPerc = loanPerc;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	
	public Person getPersonDetails() {
		return this.person;
	}
	
}
