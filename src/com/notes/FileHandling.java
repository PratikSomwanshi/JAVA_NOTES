package com.notes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {

		File f2 = new File("data");
		f2.mkdir();
		File f1 = new File("data", "abc.txt");
		f1.createNewFile();

		FileWriter fw = new FileWriter(f1);

		fw.write("Hello, I am rohan");

		fw.close();
		FileReader a = new FileReader(f1);
//		int i = a.read();
//
//		while (i != -1) {
//			System.out.print((char) i);
//			i = a.read();
//		}

		BufferedReader br = new BufferedReader(a);
		String line = br.readLine();
		int count = 0;
		while (line != null) {
			System.out.println(line);
			String[] arr = line.split(" ");
			count += arr.length;
			line = br.readLine();
		}

		System.out.println(count);
		a.close();

	}
}
