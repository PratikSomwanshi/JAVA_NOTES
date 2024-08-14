package com.notes;

public class CommonUtilityMethod {
	public static void main(String[] args) {

		String x = "10";

//		Integer y = Byte.parseByte(x);  this will give error that can not convert from byte( primitive ) to Integer( non-primitive )

//		Integer y = (Integer)Byte.parseByte(x); this also dont work because 'Byte.parseByte(x)' returning primitive byte and jvm cant convert primitive byte to non primitive Integer automatically

		Integer y = (int) Byte.parseByte(x);// valid

		// TODO: Integer to String

		int a = 10;
		Integer b = new Integer(a);

		String ab = String.valueOf(a);
		String ba = String.valueOf(b);
	}
}
