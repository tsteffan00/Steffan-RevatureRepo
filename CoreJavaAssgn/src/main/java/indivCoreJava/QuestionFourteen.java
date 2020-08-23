package indivCoreJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QuestionFourteen {
	public static void switchCase() {
		int numInput;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select '1', '2', or '3'.");
		numInput = scanner.nextInt();
		
		switch (numInput) {
		case 1:
			int number = 16;
			double solved = Math.sqrt(number);
			System.out.println("Square root of 16 is: " + solved);
			break;
		case 2:
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));
			break;
		case 3:
			String string = "I am learning Core Java";
			String strArray[] = string.split(" ");
			
			for (int count = 0; count < strArray.length; count++) {
				System.out.print(strArray[count] + " ");
			}
			break;
		default:
			System.out.println("Error. Bad input.");
		}
	}
}
