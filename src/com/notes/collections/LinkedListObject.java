package com.notes.collections;

import java.util.LinkedList;

public class LinkedListObject {
	public static void main(String[] args) {
		// stores data in doubly linked list
//		 dont have default value
		LinkedList<Integer> lr = new LinkedList<>();

		lr.add(20);
		lr.add(10);
		lr.add(30);
		lr.add(40);
		lr.add(50);

		System.out.println(lr);
		lr.add(0, 100);
		System.out.println(lr.get(0));
		System.out.println(lr);
	}
}
