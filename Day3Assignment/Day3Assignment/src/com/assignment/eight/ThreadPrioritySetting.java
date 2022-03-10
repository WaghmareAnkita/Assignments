package com.assignment.eight;

public class ThreadPrioritySetting {
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
				System.out.println(i + 1 + " Ankita Ashokrao Waghmare" + " " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Thread 2");
		
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1 + " Ankita Ashokrao Waghmare" + " " + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "Thread 2");

		t1.setPriority(Thread.MAX_PRIORITY);	//10
		t2.setPriority(Thread.MIN_PRIORITY);	//1
		t3.setPriority(Thread.NORM_PRIORITY);	//5


		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());

		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t2.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		t3.start();
	}
}
