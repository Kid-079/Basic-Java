package newString.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Equality
		String stringInput1 = "Survive";
		String stringInput2;

		Scanner userInput = new Scanner(System.in);
		System.out.print("\nInput String : ");
		stringInput2 = userInput.next();
		System.out.println("Input User   : " + stringInput2);

		if(stringInput2.equals(stringInput1)){
			System.out.println("Match");
		} else {
			System.out.println("Not Match");			
		}
 	}
}

