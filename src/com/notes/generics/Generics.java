package com.notes.generics;

class Student<T> {
	private int id;
	private String name;

	public Student() {
		this.id = 1;
		this.name = "Rohan";
	}

	public void m1(Integer i) {
		System.out.println(i);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Generics {
	public static void main(String[] args) {
		Student<? extends Integer> s = new Student<>();

		s.m1(10);
	}
}
