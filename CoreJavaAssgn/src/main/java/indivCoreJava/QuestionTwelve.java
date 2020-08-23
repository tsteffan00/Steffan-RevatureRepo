package indivCoreJava;

import java.util.ArrayList;

public class QuestionTwelve {
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	static int counter = 0;
	
	public static void enhancedFill() {
		for (int counter = 1; counter <= 100; counter++) {
			numbers.add(counter);
		}
		for (int counter : numbers) {
			if ((counter) % 2 == 0) {
				System.out.print(counter + " ");
			}	
		}
		System.out.println();
	}
}
