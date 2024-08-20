package com.notes.MultiThreading;

public class DemonThread implements Runnable {

	@Override
	public void run() {
		System.out.println("demo");

		if (Thread.currentThread().isDaemon()) {
			System.out.println("Demon Thread");
		} else {
			System.out.println("local thread");
		}

		synchronized (this) {
			System.out.println(this);
		}
	}

	public static void main(String[] args) {
		DemonThread d = new DemonThread();

		Thread t = new Thread(d);

		t.setDaemon(true); // Set as daemon thread before starting

		t.start();
	}
}