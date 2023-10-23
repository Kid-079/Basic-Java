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

		// Read File
		System.out.println((char)byteFileInput.read());
		System.out.println((char)charFileInput.read());
		System.out.println((char)byteFileInput.read());
		System.out.println((char)charFileInput.read());
	}
}