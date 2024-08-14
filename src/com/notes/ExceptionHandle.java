package com.notes;

public class ExceptionHandle {
	
	public static void oracle() throws Error{
		int num = 10;
		
//		if(num > 5) {
//			throw new Exception("num is five");
//		}
			
//		System.out.println("finally");
		oracle();
		
	}
	
	public static void main(String[] args) {
		
		int num = 0;
		
		try {
			oracle();			
		} catch (Error e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Byte b = new Byte((byte)10);
		
		System.out.println("Hello finally");
	}
}
