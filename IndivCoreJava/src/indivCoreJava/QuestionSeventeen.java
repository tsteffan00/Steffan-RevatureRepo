package indivCoreJava;

import java.util.Scanner;

public class QuestionSeventeen {
	public static void simpleInterest() {
		Scanner scanInt = new Scanner(System.in);
		System.out.println("Select your principal.");
		int principal = scanInt.nextInt();
		System.out.println("Select your rate.");
		int rate = scanInt.nextInt();
		System.out.println("Select your time.");
		int time = scanInt.nextInt();
		
		int interest = principal * rate * time;
		System.out.println("Your simple interest is: " + interest);
	}
}
