package indivCoreJava;

import java.util.Scanner;

public class QuestionThree {
	//Method reads input.
	public static void reversal() {
		String string;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string.");
		string = scan.nextLine();
		
		//For loop reads the character array backwards via decrementing counter.
		for (int counter = string.length(); counter > 0; --counter) {
			System.out.print(string.charAt(counter - 1));
		}
	}
}
