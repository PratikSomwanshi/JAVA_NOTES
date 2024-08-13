package com.practice;


public class Child{
	int id;
	String name;
	String city;
	
	protected Child(int id, String name, String city) {
		// TODO Auto-generated constructor stub
		this.city = city;
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		getData();
	}
}
