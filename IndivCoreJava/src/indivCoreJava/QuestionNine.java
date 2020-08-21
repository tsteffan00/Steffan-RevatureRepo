package indivCoreJava;

import java.util.ArrayList;

public class QuestionNine {
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	static int counter = 0;
	
	public static void fillAndPrint() {
		for (int counter = 0; counter < 100; counter++) {
			numbers.add(counter + 1);
			
			if (isPrime(counter) == true) {
				System.out.println(counter);
			}
		}
	}
	
	public static boolean isPrime(int counter) {
		if (counter <= 1) {
			return false;
		}
		
		for (int i = 2; i <= (counter / 2); ++i) {
			if ((counter % i ) == 0) {
				return false;
			}
		}
		return true;
	}
}
