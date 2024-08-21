package com.notes.InnerClass;

public class InnerClass {
	public static void main(String[] args) {
		Helper s = new Helper();
//		s.setName("John"); // Initialize the name variable

		System.out.println(s.getName());
	}

	private static class Helper {
		private int id;
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}