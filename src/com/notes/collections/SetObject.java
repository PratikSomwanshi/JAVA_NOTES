package com.notes.collections;

import java.util.HashSet;

public class SetObject {
	public static void main(String[] args) {
		HashSet<Integer> ht = new HashSet<>();

		ht.add(10);
		ht.add(20);
		ht.add(30);
		ht.add(40);

		System.out.println(ht);
	}
}
