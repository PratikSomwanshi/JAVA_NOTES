package com.notes.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorObject {
	public static void main(String[] args) {
//		It is synchronised method means only one thread can access at a time 
		Vector<Integer> vr = new Vector<>();

		vr.add(10);
		vr.add(20);
		vr.add(30);
		vr.add(40);

		Enumeration<Integer> ele = vr.elements();

		while (ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}

	}
}
