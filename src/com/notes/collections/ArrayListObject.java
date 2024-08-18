package com.notes.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListObject {
	public static void main(String[] args) {
		List ar = new ArrayList();
		ArrayList a = new ArrayList();

		a.add(10);

		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
//		ar.add(new Student());

		System.out.println(ar);

//		ar.remove(1);

//		System.out.println(ar);
//		ar.add(0, 50);
//		System.out.println(ar);
//		ar.set(0, 5);
//		System.out.println(ar);
//		ar.removeAll(a);
//		System.out.println(ar);
//		System.out.println(ar.get(1));
//		System.out.println(ar.isEmpty());

//		for (Object obj : ar) {
//			System.out.print(obj + " ");
//		}

//		Iterator iterator = ar.iterator();
//		while (iterator.hasNext()) {
//			System.out.print(iterator.next() + " ");
//		}
//		System.out.println();
//		ListIterator itr = ar.listIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		ar.forEach(i -> {              java 1.8v
//			System.out.println(i);
//		});
		ListIterator itr = ar.listIterator();

		while (itr.hasNext()) {
			itr.next();
		}

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}
}

class Student {
	int id;
	String name;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: " + id + " -- " + " name: " + name;
	}
}
