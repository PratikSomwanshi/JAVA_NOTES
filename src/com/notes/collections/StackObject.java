package com.notes.collections;

import java.util.Enumeration;
import java.util.Stack;

public class StackObject {
	public static void main(String[] args) {
//		LIFO
//		legacy class extending from vector
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);

		System.out.println(st);
		System.out.println(st.peek()); // top element returned
		System.out.println(st.pop()); // remove top element
		System.out.println(st);

		Enumeration<Integer> er = st.elements();
		while (er.hasMoreElements()) {
			System.out.println(er.nextElement());
		}

	}
}
