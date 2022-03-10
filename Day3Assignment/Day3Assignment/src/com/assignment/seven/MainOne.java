package com.assignment.seven;


public class MainOne {

	public static void main(String[] args) {

		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		Thread t3 = new MyThread();

		t1.start();

		try {Thread.sleep(10);}catch(InterruptedException e) {System.out.println(e.getMessage());};
		t2.start();
		try {Thread.sleep(10);}catch(InterruptedException e) {System.out.println(e.getMessage());};
		t3.start();
	}
}
