package com.method;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// Method Exception
		FileReader data = null;

		// Read Data Text
		System.out.println();
		System.out.println("-> Read Data <-");
		try{
			File file = new File("input.txt");
		 	data = new FileReader(file);
			char[] a = new char[20];
		 	data.read(a);
		 	for(char c : a)
			System.out.print(c);
		} catch (IOException b){
			b.printStackTrace();
		} finally {
			try{
				data.close();
			} catch (IOException d){
				d.printStackTrace();
			}
		}

		System.out.println("\nEnd Program");
	}
}