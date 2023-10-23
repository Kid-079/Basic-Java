package com.inputOutput;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		// Open File
		// byte Stream      --> FileInputStream
		// character stream --> FileReader

		FileInputStream byteFileInput = new FileInputStream("input.txt");
		FileReader charFileInput = new FileReader("input.txt");

		FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
		FileWriter charFileOutput = new FileWriter("outputChar.txt");

		// Read File for char file
		System.out.println("\n");
		int buffer = charFileInput.read();

		while (buffer != -1){
			System.out.print((char)buffer);
			// System.out.println((char)buffer);
			charFileOutput.write(buffer);
			buffer = charFileInput.read();
		}

		// Close File
		byteFileInput.close();
		charFileInput.close();
		byteFileOutput.close();
		charFileOutput.close();
		
	}
}

// If use Character International(Japan, Korea, Arab, China, etc) use FileReader or FileWriter