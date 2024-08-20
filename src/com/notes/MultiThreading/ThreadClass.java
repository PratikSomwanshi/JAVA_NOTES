package com.notes.MultiThreading;

public class ThreadClass extends Thread {

	// Method to be executed by the thread
	public void m1() {
		System.out.println("running m1");
	}

	@Override
	// Entry point for the thread
	public void run() {
		System.out.println("mythread- start");
		m1();
		System.out.println("mythread- end");
	}

	public static void main(String[] args) {
		System.out.println("main- start");

		// Approach 2: Creating a new Thread object and passing the ThreadClass instance
		// to it
		ThreadClass tc = new ThreadClass();
		Thread t = new Thread(tc);

		// Starting the thread
		t.start();

		System.out.println("main- end");

		// Output:
		// main- start
		// mythread- start
		// running m1
		// mythread- end
		// main- end

		// Explanation:
		// 1. The main method begins execution, printing "main- start".
		// 2. A new Thread object 't' is created, passing the ThreadClass instance 'tc'
		// to it.
		// 3. The 't' thread is started using the start() method.
		// 4. The 't' thread executes the run() method, printing "mythread- start".
		// 5. The m1() method is called by the 't' thread, printing "running m1".
		// 6. The 't' thread finishes execution, printing "mythread- end".
		// 7. The main method completes execution, printing "main- end".
		// Note: The output may vary in order due to concurrent execution of threads.
	}
}