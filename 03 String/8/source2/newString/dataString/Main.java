package newString.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		String string1 = "reflek";

		// Replace
		String string2 = string1.replace("f","s");
		String string3 = string1.replace("l","p");
		String string4 = string1.replace("re","RE");
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
	}
}
