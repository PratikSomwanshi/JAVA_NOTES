package com.notes.MultiThreading;

public class DeadLock {
	public static void main(String[] args) {
		String s1 = "Rohan";
		String s2 = "Kamlesh";

		Thread t = new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println(Thread.currentThread().getName() + " start");

					synchronized (s2) {
						System.out.println(Thread.currentThread().getName() + " first inner start");

					}
				}
			};
		};

		Thread t1 = new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName() + " start");

					synchronized (s1) {
						System.out.println(Thread.currentThread().getName() + " second inner start");

					}
				}
			};
		};

		t.start();
		t1.start();
	}
}
