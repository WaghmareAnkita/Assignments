package com.assignment.two;

public class Main {

	public static void main(String[] args) {
		Runnable obj1=new MyThread();
		
		Thread t1=new Thread(obj1," Thread-1");
		Thread t2=new Thread(obj1," Thread-2");
		Thread t3=new Thread(obj1," Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
