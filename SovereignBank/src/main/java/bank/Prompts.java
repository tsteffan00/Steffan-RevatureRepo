package bank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prompts {
	public static void initialPrompt() {
		System.out.println("Welcome to Sovereign Bank.\n"
				+ "If logging in, press 1. If registering a new account, "
				+ "press 2. To exit, press 3.");
		Scanner userReader = new Scanner(System.in);
		ArrayList<String> userLoginHolder = new ArrayList<String>();
		//String[] userLoginHolder = {"Username", "Password", "0"};
		
		int errorCounter = 0;
		while (errorCounter == 0) {
			
		int numInput = userReader.nextInt();
		
			switch (numInput) {
			case 1: // Login Option
				System.out.println("Please input your username:");
				userLoginHolder.add(userReader.next());
				System.out.println("Please input your password:");
				userLoginHolder.add(userReader.next());
				Random rand = new Random();
				int minimum = 100;
				int randRange = 999 - minimum + 1;
				userLoginHolder.add(Integer.toString(rand.nextInt(randRange) + minimum)); //Generates account number.
				System.out.println(userLoginHolder); //Test output to console.
				
				try {
					FileOutputStream fileOut = new FileOutputStream("userlogin.txt");
					ObjectOutputStream out = new ObjectOutputStream(fileOut);
					out.writeObject(userLoginHolder);
					out.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				
				
				//Connect array with pre-existing account read from userlogin.txt.
				errorCounter++;
				break;
			case 2: // Registration Option
				System.out.println("Please input your desired username:");
				userLoginHolder.add(userReader.next());
				System.out.println("Please input your desired password:");
				userLoginHolder.add(userReader.next());
				
				
				errorCounter++;
				break;
			case 3: //Exit
				System.out.println("Goodbye. Bank with us again soon.");
				System.exit(0);
			default: // Bad input catcher.
				System.out.println("Incorrect input. Please try again.");
				break;
			}
		}
	}
}
