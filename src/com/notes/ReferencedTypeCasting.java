package com.notes;

public class ReferencedTypeCasting implements Cloneable {

	void getName() {
		System.out.println("Hello");
	}

	public static void main(String[] args) throws Exception {
		ReferencedTypeCasting d = new ReferencedTypeCasting();

//		widenning / Upcasting ( automatic typecasting )
		Object obj = d.clone();

//		Narrowing / downcasting of object 
		ReferencedTypeCasting dd = (ReferencedTypeCasting) obj;
		dd.getName();
	}
}
