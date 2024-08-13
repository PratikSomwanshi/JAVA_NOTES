package com.notes.interfaces;


//  Apart from one abstract method, a functional interface can also have the following methods
//	that do not count for defining it as a functional interface.
//		• Default methods
//		• Static methods
//		• Public methods inherited from the Object class


@FunctionalInterface
public interface FunInterface {
	void say();
	
	default void getName() {
		System.out.println("hello");
	}
	
	static void getAge() {
		System.out.println("done");
	}
}
