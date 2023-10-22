package com.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		FileInputStream inputFile = new FileInputStream("input.txt");
		System.out.println((char)inputFile.read());
		System.out.println("End Program");
	}
}