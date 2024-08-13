package com.practice;

public class Student extends Child{
	int rank;
	
	protected Student() {
		// TODO Auto-generated constructor stub
		super(1,"something", "city");
	}
	
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.rank = 100;
		
		System.out.println(student.name);
				
	}
}
