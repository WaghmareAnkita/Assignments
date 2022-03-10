package com.assignment.three;

public class Main {

	public static void main(String[] args) {
		Runnable runObj=new MyRunnable();
		
		Thread t1=new Thread(runObj);
		
		t1.start();
	}
	
	
}
