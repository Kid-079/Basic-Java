package com.createReadUpdateDelete;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.Arrays;
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
					searchData();
					break;
				case "3":
					System.out.println("\n===============");
					System.out.println("ADD DATA PRODUCT");
					System.out.println("=================");
					addData();
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

		System.out.println("\n| No |\tName Product |\tInfoProduct     |\tPrice   ");
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
			// System.out.printf("|\t%-17s ", stringToken.nextToken());
			System.out.printf("|\t%s ", stringToken.nextToken());
			System.out.printf("\n");

			data = bufferInput.readLine();
		}
		System.out.println("-----------------------------------------------------");
	}

	private static void searchData() throws IOException{
		
		// Check Database 
		try{
			File file = new File("database.txt");
		} catch (Exception e){
			System.err.println("Database Not Found");
			System.err.println("Please Insert Data or Create Database first");
			return;			
		}

		// create Search Data
		Scanner inputData = new Scanner(System.in);
		System.out.print("Insert Product Name : ");
		String searchString = inputData.nextLine();
		String[] keywords = searchString.split("\\s+");

		// Check Keyword in Database
		checkProductInDatabase(keywords,true);
	}

	private static boolean checkProductInDatabase(String[] keywords, boolean isDisplay) throws IOException {
		FileReader fileInput = new FileReader("database.txt");
		BufferedReader bufferInput = new BufferedReader(fileInput);

		String data = bufferInput.readLine();
		boolean isExist = false;
		int dataNumber = 0;

		if(isDisplay){
			System.out.println("\n| No |\tName Product |\tInfoProduct     |\tPrice   ");
			System.out.println("-----------------------------------------------------");
		}

		while (data != null) {
			// Check Keyword in row
			isExist = true;

			for(String keyword:keywords){
				isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
			}

			// Check Condition
			if(isExist){
				if(isDisplay){					
					dataNumber++;
					StringTokenizer stringToken = new StringTokenizer(data, ",");

					stringToken.nextToken();
					System.out.printf("| %2d ", dataNumber);
					System.out.printf("|\t%-5s ", stringToken.nextToken());
					System.out.printf("|\t%-15s ", stringToken.nextToken());
					System.out.printf("|\t%s ", stringToken.nextToken());
					System.out.printf("\n");
				} else {
					break;
				}
			}

			data = bufferInput.readLine();
		}

		if(isDisplay){
			System.out.println("------------------------------------------------------------------");
		}

		return isExist;
	}

	private static void addData() throws IOException {
		FileWriter fileOutput = new FileWriter("database.txt",true);
		BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

		// Create Input for User
		Scanner inputData = new Scanner(System.in);
		String nameProduct, infoProduct, price;

		System.out.print("Insert Product Name : ");
		nameProduct = inputData.nextLine();
		System.out.print("Insert Info Product : ");
		infoProduct = inputData.nextLine();
		System.out.print("Insert Product Price: ");
		price = inputData.nextLine();
		// 

		// Check Product in Database
		String[] keywords = {nameProduct+","+infoProduct+","+price};
		System.out.println(Arrays.toString(keywords));

		boolean isExist = checkProductInDatabase(keywords,false);
		// System.out.println(isExist);

		// Write Product in Database
		if(!isExist){
			System.out.println(valuePerProduct(nameProduct,price));
			long noValue = valuePerProduct(nameProduct,price) + 1;

			String newProduct = nameProduct.replaceAll("\\s+","");
			String primaryKey = newProduct + "_" + price + noValue;
			System.out.println("\nData");
			System.out.println("--------------------------------");
			System.out.println("Primary Key   : " + primaryKey);
			System.out.println("Product Name  : " + nameProduct);
			System.out.println("Info Product  : " + infoProduct);
			System.out.println("Price         : " + price);


			boolean isAdd = getYesorNo("Do you want to add a new data to Database?");

			if(isAdd){
				bufferOutput.write(primaryKey + "," + nameProduct + "," + infoProduct + "," + price);
				bufferOutput.newLine();
				bufferOutput.flush();
			}
		}else{
			System.out.println("product is ready, insert another product");
			checkProductInDatabase(keywords,true);
		}

		bufferOutput.close();

	}

	private static long valuePerProduct(String product, String price) throws IOException{
		FileReader fileInput = new FileReader("database.txt");
		BufferedReader bufferInput = new BufferedReader(fileInput);

		long value = 0;
		String data = bufferInput.readLine();
		Scanner dataScanner;
		String primaryKey;

		while(data != null){
			dataScanner = new Scanner(data);
			dataScanner.useDelimiter(",");
			primaryKey = dataScanner.next();
			dataScanner = new Scanner(primaryKey);
			dataScanner.useDelimiter("_");

			product = product.replaceAll("\\s+","");

			if (product.equalsIgnoreCase(dataScanner.next()) && price.equalsIgnoreCase(dataScanner.next())){
				value = dataScanner.nextInt();
			}
			data = bufferInput.readLine();
		}

		return value;
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