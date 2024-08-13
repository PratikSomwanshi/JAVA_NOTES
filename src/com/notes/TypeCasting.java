package com.notes;

public class TypeCasting {
//	 In java we have following 2 types of type castings
//	   1.type casting w.r.t primitive data types
//	   2.type casting w.r.t reference types
	
	public static void main(String[] args) {
		// TODO: Primitive Data types
//		 we have following 2 types of Type casting w.r.t primitive data types
//		 	1) Widening
//		 	2) Narrowing
		
//		Compatible data types are byte, short, int, long, float, double, char
		
		// widening
		int a = 10;
		
		double x = a; // no need to tell casting jvm handle internally
		
		// narrowing
		
		double y = 10.99;
		
		int b = ( int ) y;
		
//		Type casting w.r.t references is also classified into following 2 types
//			1) Up Casting ( child to parent )
//			2) Down Casting ( parent to child )
		
		
		// up casting
		
		Parent parent = new Child("Rohan");
		System.out.println(parent.id);
		
		// down casting
		
//		Child child = ( Child ) new Parent();  invalid this will throw class not found exception
//		System.out.println(child.id); // When you create an object of the Parent class (new Parent()), it is not an instance of the Child class. The JVM does not allow casting an object to a subclass unless the object was instantiated as that subclass.
		
		Child child = ( Child ) parent;
		System.out.println(child.name);
	}
}


class Parent{
	int id;
}


class Child extends Parent{
	String name;
	
	public Child(String name) {
		this.name = name;
	}
}



