package com.notes.interfaces;

//An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
interface Vehicle {
//	all variables in interfaces in java are public static final by default 
	int id = 0;  // public static final int id = 0; JVM representation
	
	String name = "BMW";
	
//	All the methods declared in interface are public abstract by default whether we specify or not
	void getCompanyName();
	
}

interface Car extends Vehicle{
	String carName = "BMW_888";
	
	void getCarName();
	
	default void getCarColor() {  // This  method directly not available on the implementing class you need to create the object of implementing class and then call it
		System.out.println("Black");
	}
	
	static void getCarDoors() { 
		System.out.println("4");
	}
}

//if our class is not providing implementation for at least 1 method then our class must be declared as abstract
public class Interfaces implements Car, Bike{
	
	public static void main(String[] args) {
		Car.getCarDoors();
		Interfaces i = new Interfaces();
		i.getCarColor();
		System.out.println();
	}

	@Override
	public void getCompanyName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCarName() {
		// TODO Auto-generated method stub
		
	}
}
