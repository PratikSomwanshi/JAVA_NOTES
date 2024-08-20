package com.notes.MultiThreading;

/**
 * Implementing the Runnable interface to create a new thread. The Runnable
 * interface has a single method, run(), which contains the code that
 * constitutes the new thread's task.
 */
public class RunnableImpl implements Runnable {

	/**
	 * The run method contains the code that constitutes the new thread's task.
	 */
	@Override
	public void run() {
		// 1. New thread starts and prints its name along with "- start"
		System.out.println(Thread.currentThread().getName() + "- start");

		// 2. Simulating a time-consuming task (e.g., data processing, file I/O)
		for (int i = 0; i < 100000000; i++) {
			// 3. Doing some work (e.g., calculations, data manipulation)
		}

		// 4. New thread finishes its task and prints "mythread- end"
		System.out.println(Thread.currentThread().getName() + "- end");
	}

	public static void main(String[] args) {
		// 1. Main thread starts and prints its name along with "- start"
//		System.out.println(Thread.currentThread().getName() + " - start");

		// 2. Creating a new thread by implementing the Runnable interface
		RunnableImpl r = new RunnableImpl();

		// 3. Creating a Thread object and passing the Runnable instance to it
		Thread t = new Thread(r);

		// 4. Starting the new thread, which will execute the run() method
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();

		Thread t2 = new Thread(r);
		t.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		Thread t3 = new Thread(r);
		t.setPriority(Thread.NORM_PRIORITY);
		t3.start();

		// 5. Main thread's task (e.g., data processing, user input handling)
		for (int i = 0; i < 100000000; i++) {
			// 6. Doing some work (e.g., calculations, data manipulation)
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 7. Main thread finishes its task and prints "main - end"
//		System.out.println("main - end");

		// Explanation:
		// 1. Main thread starts and prints "main - start".
		// 2. A new thread is created and started, executing the run() method.
		// 3. Both threads run concurrently, with the main thread finishing first.
		// 4. The new thread prints "mythread- start" and "mythread- end" after
		// completing its task.
		// 5. The main thread and new thread run independently, with their own execution
		// paths.

		// Output:
		// main - start
		// main - end
		// mythread- start
		// mythread- end
	}
}