package com.practice;

public class TwoInstacnceClass {
	public static void main(String[] args) {
		try {
			TwoInstance twoInstance = new TwoInstance();
			TwoInstance twoInstance2 = new TwoInstance();
			TwoInstance twoInstance3 = new TwoInstance();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

class TwoInstance{
	private static int instance = 0;
	
	public TwoInstance() throws Exception{
		if(instance >= 2) {
			throw new Exception("can not create a instance more than 2");
		}
		instance++;
		System.out.println("instance created successfully " + instance);
	}
}
