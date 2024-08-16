package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TwoFilesInThird {
	public static void main(String[] args) throws IOException {

		File f = new File("abc.txt");
		File f1 = new File("xyz.txt");
		f.createNewFile();
		f1.createNewFile();

		FileWriter w = new FileWriter(f);
		w.write("HEllo, I am Rohan");
		w.close();
		w = new FileWriter(f1);
		w.write("I am a Java Developer");
		w.close();
		FileReader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);

		String fist = br.readLine();
		br.close();

		r = new FileReader(f1);
		br = new BufferedReader(r);

		String second = br.readLine();
		br.close();

		File third = new File("third.txt");
		FileWriter fw = new FileWriter(third);
		fw.write(fist + '\n' + second);
		fw.close();

		r = new FileReader(third);
		br = new BufferedReader(r);

		String temp = br.readLine();
		while (temp != null) {
			System.out.println(temp);
			temp = br.readLine();
		}

		br.close();
	}
}
