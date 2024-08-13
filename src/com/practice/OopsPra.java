//package com.practice;
//
//public class OopsPra {
//	public static void main(String[] args) {
//		//System.out.println("Hello Rohan ");
//		
//		User rohan = new User();
//		rohan.id = 100;
//		rohan.age = 32;
//		rohan.name = "Rohan";
//		User mohan = new User();
//		mohan.id = 101;
//		mohan.age = 20;
//		mohan.name = "mohan";
//		
//		Driver driver = new Driver();
//		driver.setUser(mohan);
//		driver.setUser(rohan);
//		
//		System.out.println(driver.getUser(101).toString());
//		
//	}
//}
//
//class User{
//	int id;
//	String name;
//	int age;
//	
//	@Override
//	public String toString() {
//		return id + " " + name + " " + age;
//	}
//}
//
//class Driver{
//	Object[] user = {0,0};
//	static int count = 0;
//	void setUser(User user) {
//		this.user[count] = user;
//		count++;
//		System.out.println("data added successfully");
//	}
//	
//	Object getUser(int id) {
//		for(Object us: user) {
//			User u = (User)us;
//			if(u.id == id) {
//				return u;
//			}
//		}
//		return -1;
//	}
//	
//}
//
//
//
//
