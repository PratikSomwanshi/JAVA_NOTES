package com.notes;


abstract class Driverrr{
//	• An abstract class must be declared with an abstract keyword.
//	• It can have abstract and non-abstract methods.
//	• It cannot be instantiated.
//	• It is used for abstraction.
//	Any class that extends an abstract class must implement all the abstract methods.
	
//	The method body will be defined by its subclass.
//	Abstract method can never be final and static.
	abstract void getMsg();
	
//	abstract keyword not allowed on variable
//	abstract int a; // invalid
	
	void getName() {
		System.out.println("hello");
	}
	
	static void getData() {
		System.out.println("gettting the data");
	}
	
}

public class AbstractKeyword extends Driverrr{

//	invalid operation because visibility can not be reduced when inherited of method
//	private void getMsg() {           
//		System.out.println("Hello");
//	}
	
	@Override
	void getMsg() {
		System.out.println("Hello");
		getData();
		getName();
	}
	
//	invalid because static method can not be overriden
//	@Override
//	static void getData() {
//		System.out.println("overrided method");
//	}
	
}


