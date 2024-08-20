package com.notes.MultiThreading;

public class Synchronization implements Runnable {

	public synchronized void m1() {
		System.out.println(Thread.currentThread().getName() + " start");
		for (int i = 0; i < 10000000; i++) {
			int result = 0;
			result += 100;
		}

		synchronized ("resource1") {
			System.out.println("thread blocked");
		}
		System.out.println(Thread.currentThread().getName() + " end");
	}

	@Override
	public void run() {
		m1();
	}

	public static void main(String[] args) {
		Synchronization s = new Synchronization();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
//		t.setName("first thread");
		t1.start();
		t2.start();
		t3.start();

	}
}
