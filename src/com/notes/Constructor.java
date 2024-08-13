package com.notes;

public class Constructor {
	// Constructor is a special method in java which is used to initialize the data
	// constructor will be executed during the creation of object
	
	public static void main(String[] args) {
		Hello hello = new Hello(0, "Rohan");
		hello.getName();
	}
	
}

class Hello{
	int id;
	String name;
	
	Hello(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void getName() {
		System.out.println(name);
	}
}
