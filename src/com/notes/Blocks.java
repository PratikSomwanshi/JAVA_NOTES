package com.notes;

public class Blocks {
//	when same block written execution happen on the basic of order
	static {
		int count = 0;
		for(int i = 0; i < 100000; i++) {
			count += 10;
		}
		System.out.println("static block 2");
	}
	static {
		int count = 0;
		for(int i = 0; i < 100000; i++) {
			count += 10;
		}
		System.out.println("static block 1");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		Helloo helloo = new Helloo();
		Helloo hello = new Helloo();
	}
}


class Helloo{
//	memory alloction in JVM and execution done in bottom up approach
//	1) static variable
//	2) static methods
//	3) static block
	
//	Sequence of execution
//		Static Initialization Block (SIB)
//		Instance Initialization Block (IIB)
//		Constructor
//		Method Block
	
//	 static block will execute after class loaded
//	Executed once when the class is first loaded into memory by the JVM (before any instance of the class is created or any static methods or fields are accessed).
	static {
		int count = 0;
		for(int i = 0; i < 100000; i++) {
			count += 10;
		}
		System.out.println("static block");
	}
	
//	block will execute before object creation
//	Executed every time an instance of the class is created, right before the constructor is called.
	{
		int count = 0;
		for(int i = 0; i < 100000; i++) {
			count += 10;
		}
		System.out.println("block is executed");
	}
	
	public Helloo() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor callled");
	}
}