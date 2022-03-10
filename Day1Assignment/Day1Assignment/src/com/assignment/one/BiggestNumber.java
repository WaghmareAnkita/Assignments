package com.assignment.one;

public class BiggestNumber {
	public static void main(String[] args) {
		int res=BiggestNumber.bigNumber(4, 45, 1);
		System.out.println(res+" is the biggest number");
		
	}
	public static int bigNumber(int one, int two, int three) {
		
		int big=one;

		if(two>big) {
			big=two;
		}
		if(three>big) {
			big=three;
		}
		return big;
	}

}
