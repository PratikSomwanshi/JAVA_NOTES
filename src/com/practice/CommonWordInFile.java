package com.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CommonWordInFile {
	public static void main(String[] args) throws IOException {
		File f = new File("hero.txt");
		f.createNewFile();
		File f1 = new File("vilan.txt");
		f1.createNewFile();

		FileWriter w = new FileWriter(f);
		w.write("spiderman, ironman, captain_america");
		w.close();

		FileWriter w1 = new FileWriter(f1);
		w1.write("ironman, silver_surfer, thanos");
		w1.close();

		FileReader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);

		String first = br.readLine();

		br.close();

		r = new FileReader(f1);
		br = new BufferedReader(r);

		String second = br.readLine();

		br.close();

//		System.out.println(first + " " + second);

		String[] fArr = first.split(", ");
		String[] SArr = second.split(", ");

		System.out.println(Arrays.toString(fArr));
		System.out.println(Arrays.toString(SArr));

		Boolean x = false;

		for (String i : fArr) {
			for (String j : SArr) {
				if (i.equals(j)) {
					System.out.println(i + " matches " + j);
					x = true;
					break;
				}
			}
		}

		if (x != true) {
			System.out.println("no match");
		}

	}
}
