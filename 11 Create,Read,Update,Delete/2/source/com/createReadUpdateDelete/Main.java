package com.createReadUpdateDelete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// Create Terminal Input
		Scanner inputData = new Scanner(System.in);
		String chooseProduct;
		boolean condition = true;

		while(condition){
			clearScreen();
			System.out.println("Database Product\n");
			System.out.println("1.\tSee All Product");
			System.out.println("2.\tSearch Data Product");
			System.out.println("3.\tAdd Data Product");
			System.out.println("4.\tChange Data Product");
			System.out.println("5.\tDelete Data Product");

			System.out.print("\n\nChoose Product : ");
			chooseProduct = inputData.next();

			switch (chooseProduct) {
				case "1":
					System.out.println("\n================");
					System.out.println("LIST ALL PRODUCT");
					System.out.println("================");
					showData();
					break;
				case "2":
					System.out.println("\n================");
					System.out.println("SEARCH DATA PRODUCT");
					System.out.println("==================");
					// search data
					break;
				case "3":
					System.out.println("\n===============");
					System.out.println("ADD DATA PRODUCT");
					System.out.println("=================");
					// add data
					break;
				case "4":
					System.out.println("\n==================");
					System.out.println("CHANGE DATA PRODUCT");
					System.out.println("====================");
					// change data
					break;
				case "5":
					System.out.println("\n=================");
					System.out.println("DELETE DATA PRODUCT");
					System.out.println("===================");
					// delete data
					break;
				default:
					System.err.println("\nNot Found Data Input\nChoose data [1-5]");
			}

			condition = getYesorNo("Continue to Choose Another?");
		}
	}

	private static void showData() throws IOException {
		FileReader fileInput;
		BufferedReader bufferInput;

		try{
			fileInput = new FileReader("database.txt");
			bufferInput = new BufferedReader(fileInput);
		} catch (Exception a){
			System.err.println("Database Not Found");
			System.err.println("Please, Add Data First");
			return;
		}

		System.out.println("\n| No |\tName Product |\tInfo Product     |\tPrice   ");
		System.out.println("-----------------------------------------------------");
		String data = bufferInput.readLine();
		int dataNumber = 0;

		while (data != null){
			dataNumber++;

			StringTokenizer stringToken = new StringTokenizer(data, ",");

			stringToken.nextToken();
			System.out.printf("| %2d ", dataNumber);
			System.out.printf("|\t%-5s ", stringToken.nextToken());
			System.out.printf("|\t%-15s ", stringToken.nextToken());
			System.out.printf("|\t%s ", stringToken.nextToken());
			System.out.printf("\n");

			data = bufferInput.readLine();
		}
		System.out.println("-----------------------------------------------------");
	}

	private static boolean getYesorNo(String message){
		Scanner inputData = new Scanner(System.in);
		System.out.print("\n" + message + " (y/n)?");
		String chooseProduct = inputData.next();

		while (!chooseProduct.equalsIgnoreCase("y") && !chooseProduct.equalsIgnoreCase("n")){
			System.err.println("insert wrong message, Choose(y/n)");
			System.out.print("\n" + message + " (y/n)?");
			chooseProduct = inputData.next();
		}
		return chooseProduct.equalsIgnoreCase("y");
	}

	private static void clearScreen(){
		try {
			if (System.getProperty("os.name").contains("Windows")){
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			} else {
				System.out.println("\033\143");
			}
		} catch (Exception a){
			System.err.println("Cant Clear Screen");
		}
	}
}