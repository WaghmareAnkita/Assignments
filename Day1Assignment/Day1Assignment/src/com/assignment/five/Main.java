package com.assignment.five;

public class Main {

	public static void main(String[] args) {
		PersonalLoan percLoan=new PersonalLoan(8.6f, 500000.00, 36, "Ankita", "Bangalore", 9988667771L);
		HomeLoan homeLoan=new HomeLoan(12.4f, 4800000.00, 240, "Mona", "hyderabad", 9987545543L);
		
		System.out.println("Personal Loan details-");
		System.out.println("Percentage: "+percLoan.getLoanPerc()+"%");
		System.out.println("Amount: "+percLoan.getLoanAmount());
		System.out.println("Duration: "+percLoan.getLoanDuration());
		System.out.println("Name: "+percLoan.getPersonDetails().getName());
		System.out.println("Address: "+percLoan.getPersonDetails().getCity());
		System.out.println("Contact No.- "+percLoan.getPersonDetails().getCity());
		System.out.println("================================");
		System.out.println("Home Loan details-");
		System.out.println("Percentage: "+homeLoan.getLoanPerc()+"%");
		System.out.println("Amount: "+homeLoan.getLoanAmount());
		System.out.println("Duration: "+homeLoan.getLoanDuration());
		System.out.println("Name: "+homeLoan.getPersonDetails().getName());
		System.out.println("Address: "+homeLoan.getPersonDetails().getCity());
		System.out.println("Contact No.- "+homeLoan.getPersonDetails().getCity());
	}
}
