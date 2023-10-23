package com.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = null;
		FileOutputStream fileOutput = null;

		fileInput = new FileInputStream("input.txt");

		// Read File
		int data = fileInput.read();

		while(data != -1){
			System.out.println((char) data);
			data = fileInput.read();
		}

		// Close file
		fileInput.close();
	}
}