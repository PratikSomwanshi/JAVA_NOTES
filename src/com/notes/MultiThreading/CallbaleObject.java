package com.notes.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallbaleObject implements Callable {
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " start");
		System.out.println(Thread.currentThread().getName() + " end");
		return "hi";
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		CallbaleObject c = new CallbaleObject();

		ExecutorService exService = Executors.newFixedThreadPool(2);
		Future submit = exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.submit(c);
		exService.shutdown();

		try {
			System.out.println(submit.get().toString());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
