package com.notes.MultiThreading;

public class MultithreadingMethods {
	public static void main(String[] args) throws InterruptedException {

		// Create the first thread t
		Thread t = new Thread() {
			public void run() {
				// Loop 5 times
				for (int i = 0; i < 5; i++) {
					// Print the thread name and the current iteration
					System.out.println(Thread.currentThread().getName() + " start " + i);
					try {
						// Pause execution for 1 second (1000 milliseconds)
						Thread.sleep(1000);

						// Yield allows the current thread to pause and give a chance for other threads
						// to execute
						Thread.yield();
					} catch (InterruptedException e) {
						// Handle the InterruptedException
						e.printStackTrace();
					}
				}
			}
		};

		// Create the second thread t1
		Thread t1 = new Thread() {
			public void run() {
				// Loop 5 times
				for (int i = 0; i < 5; i++) {
					// Print the thread name and the current iteration
					System.out.println(Thread.currentThread().getName() + " start " + i);
					try {
						// Pause execution for 1 second (1000 milliseconds)
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// Handle the InterruptedException
						e.printStackTrace();
					}
				}
			}
		};

		// Start the first thread t
		t.start();

		// Uncomment the line below to make the main thread wait for t to finish before
		// starting t1
		// t.join();

		// Start the second thread t1
		t1.start();
	}
}

//Expected Output (may vary due to thread scheduling):
//
//Thread-0 start 0
//Thread-1 start 0
//Thread-0 start 1
//Thread-1 start 1
//Thread-0 start 2
//Thread-1 start 2
//Thread-0 start 3
//Thread-1 start 3
//Thread-0 start 4
//Thread-1 start 4
//
//Explanation:
//- "Thread-0" is the default name for the first thread t.
//- "Thread-1" is the default name for the second thread t1.
//- The output is interleaved because both threads run concurrently, with each loop iteration followed by a 1-second pause (Thread.sleep(1000)).
//- Thread.yield() in thread t suggests to the scheduler that it might be a good time to allow other threads to execute, but it doesn't guarantee this behavior.
//- If you uncomment t.join(), t1 will only start after t finishes, leading to sequential output.
