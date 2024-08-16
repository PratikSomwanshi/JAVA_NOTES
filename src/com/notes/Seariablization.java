package com.notes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Seariablization implements Serializable {
	int id;
	transient String name; // this will not take part in object serialization

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Seariablization s = new Seariablization();
		s.id = 10;
		s.name = "Rohan";

		FileOutputStream f = new FileOutputStream("user.ser");
		ObjectOutputStream objs = new ObjectOutputStream(f);
		objs.writeObject(s);
		objs.flush();
		objs.close();

		FileInputStream is = new FileInputStream("user.ser");
		ObjectInputStream ob = new ObjectInputStream(is);
		Object o = ob.readObject();
		Seariablization oa = (Seariablization) o;
		System.out.println(oa.id);
		System.out.println(oa.name);
		ob.close();
	}
}
