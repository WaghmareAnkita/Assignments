package com.assignment.two;

public class Factorial {
	public static void main(String[] args) {
		int number=8;
		System.out.println("Factorial of "+number+" using for loop is: "+Factorial.factorialForLoop(number));
		System.out.println("Factorial of "+number+" using while loop is: "+Factorial.factorialWhileLoop(number));
	}

	public static int factorialForLoop(int number) {
		int res=1;
		if(number==0) {
			return res;
		}else {
			for(int i=1;i<=number;i++) {
				res*=i;
			}
		}
		return res;
	}
	
	public static int factorialWhileLoop(int number) {
		int res=1, count=1;
		if(number==0) {
			return res;
		}else {
			while(count<=number) {
				res*=count;
				count++;
			}
		}
		return res;
	}
}
