package com.assignment.one;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println(i+1+" Ankita Waghmare"+" "+Thread.currentThread().getName());
	}

}
