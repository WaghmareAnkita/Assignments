package com.assignment.four;

public class JoinMethodDemo {

	public static void main(String[] args) {

		Runnable obj=new DemoClass();
		
		Thread t1=new Thread(obj,"Thread One");
		Thread t2=new Thread(obj,"Thread Two");
		
		System.out.println("Started...");
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ended...");
	}

}

class DemoClass implements Runnable{
	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("Ankita Waghmare : "+Thread.currentThread().getName());
	}
}