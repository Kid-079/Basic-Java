package com.inputOutput;

import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		// BUFFERED CHAR STREAM

		// Read From File
		FileReader fileInput = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(fileInput);
		bufferedReader.mark(200);
		System.out.println();

		// Read String
		String data = bufferedReader.readLine();
		System.out.println(data);

		// Read Char
		bufferedReader.reset();
		char[] dataChar = new char[20];
		bufferedReader.read(dataChar,0,20);
		System.out.println(Arrays.toString(dataChar));

		// Read Character
		bufferedReader.reset();
		System.out.println((char)bufferedReader.read());
		System.out.println(bufferedReader.read());

		// Read Row
		bufferedReader.reset();
		System.out.println(bufferedReader.readLine());
		System.out.println(bufferedReader.readLine());

		// Write File
		FileWriter fileOutput = new FileWriter("output.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

		bufferedReader.reset();
		String row = bufferedReader.readLine();
		bufferedWriter.write(row,0,row.length());
		bufferedWriter.flush();

		// Close
		bufferedReader.close();
		bufferedWriter.close();
		fileInput.close();
		fileOutput.close();
	}
}

// If use Character International(Japan, Korea, Arab, China, etc) use FileReader or FileWriter