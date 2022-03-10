package com.assignment.eight;

public class ThreadPriorityDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1 + " Ankita Ashokrao Waghmare" + " " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Thread 1");

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1 + "Ankita Ashokrao Waghmare" + " " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Thread 2");

		//prints default priority i.e. 5
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t2.start();
	}
}
