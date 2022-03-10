package com.assignment.three;

public class StaticVariable {

	public static int variable=34;
	
	public static void main(String[] args) {
		System.out.println("Accessing static variable within same class from "
				+ "main method without class reference: "+variable);
		
		System.out.println("Accessing static variable within same class from "
				+ "main method with class reference: "+StaticVariable.variable);
		
		StaticVariable.accessingStaticVariable();
		
		/*
		 * Static members are part of the 
		 * class memory 
		 */
		StaticVariable variable=new StaticVariable();
		System.out.println("Accessing static variable within same class using Object "
				+ "reference: "+variable.variable);
	}
	public static void accessingStaticVariable() {
		System.out.println("Accessing static variable within same class from "
				+ "static method "+StaticVariable.variable);
	}
	
}
