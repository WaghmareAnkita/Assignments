package com.assignment.five;

public class ProducerConsumer {

	public static void main(String[] args) {

		Utility utility = new Utility();
		new Producer(utility);
		new Consumer(utility);

	}

}

class Consumer implements Runnable {
	private Utility utility;

	public Consumer(Utility utility) {
		this.utility = utility;
		Thread consumer = new Thread(this, "Consumer");
		consumer.start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				utility.get();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Producer implements Runnable {
	private Utility utility;

	public Producer(Utility utility) {
		this.utility = utility;
		Thread producer = new Thread(this, "Producer");
		producer.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				utility.set(i++);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Utility {
	int num;
	boolean flag=false;
//false true
	public synchronized void get() {
		
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumer: " + num);
		flag=false;
		notify();
	}

	public synchronized void set(int i) {
		
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.num = i;
		System.out.println("Producer: " + num);
		flag=true;
		notify();
	}
}
