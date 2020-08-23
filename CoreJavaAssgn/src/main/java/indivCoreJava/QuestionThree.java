package indivCoreJava;

import java.util.Arrays;

//import java.util.Scanner;

public class QuestionThree {
	//Method reads input.
	public static Character[] reversal(String string) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a string.");
//		string = scan.nextLine();
		Character[] revString = {};
		
		//For loop reads the character array backwards via decrementing counter.
		for (int counter = string.length(); counter > 0; --counter) {
			revString[counter] = string.charAt(counter - 1);
		}
		System.out.print(Arrays.toString(revString));
		return revString;
	}
}
