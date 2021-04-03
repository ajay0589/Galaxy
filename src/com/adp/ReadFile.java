package com.adp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		// File, FileReader/FileWriter, FileInputStream/FileOutputStream

		File file = new File("C:\\Users\\ajayj\\eclipse-workspace\\Galaxy\\flowers.txt");

		FileReader reader = new FileReader(file);

		BufferedReader br = new BufferedReader(reader);

		String text = "";

		while ((text = br.readLine()) != null) {
			System.out.println("text from file is: " + text);
		}

		// flowers in each line
		// flowers total count
		
	}

}
