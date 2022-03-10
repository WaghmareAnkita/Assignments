package com.assignment.three;

public class Main {

	public static void main(String[] args) {
		System.out.println("Accessing static variable from another class using class "
				+ "reference: "+StaticVariable.variable);
		
		/*
		 * Static members are part of the 
		 * class memory 
		 */
		StaticVariable variable=new StaticVariable();
		System.out.println("Accessing static variable from another class using Object "
				+ "reference: "+variable.variable);
	}
}
