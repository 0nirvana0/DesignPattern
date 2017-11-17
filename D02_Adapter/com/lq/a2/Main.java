package com.lq.a2;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			String s = Main.class.getResource("file.txt").getPath();

			f.readFromFile(s);
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			String o = Main.class.getResource("").getPath();

			f.writeToFile(o + "../newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
