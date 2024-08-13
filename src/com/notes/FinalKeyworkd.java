package com.notes;

public class FinalKeyworkd {
	public static void main(String[] args) {
		// final keyword or modifier can be used to variable, methods & classes
	}
}

// final class -> we can not extends to other classes ( can not inherit )
final class Driverr{
	//  we can’t modify value of the variable, The variable acts like a constant. Final field must be initialized when it is declared.
//	final int aa;  invalid
	final int a = 10;
	
//	If we declare a method as final then we can't override that method
	final void m1() {
		System.out.println("HEllo");
	}
}