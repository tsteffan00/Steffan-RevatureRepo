package indivCoreJava;

import java.util.ArrayList;

public class QuestionNineteen {
	ArrayList<Integer> aLI = new ArrayList<Integer>();

	public void arrayFiller() {
		int counter;
		for (counter = 1; counter < 11; counter++) {
			aLI.add(counter);
		}
		System.out.println(aLI);
	}

	public void arrayAdd() {
		double sum = 0;
		double oddSum = 0;
		int counter;
		for (counter = 0; counter < aLI.size(); counter++) {
			if ((aLI.get(counter) % 2) == 0) {
			sum = sum + aLI.get(counter);
		} else {
			oddSum = oddSum + aLI.get(counter);
		  }
		}
		System.out.println("Sum of evens in  the 1-10 array is: " + sum);
		System.out.println("Sum of odds in the 1-10 array is: " + oddSum);
	}

	public void primeChecker() {
		for (int primeTest = 0; primeTest < aLI.size(); primeTest++) {
				if (QuestionNine.isPrime(aLI.get(primeTest))) {
					aLI.remove(aLI.get(primeTest--));
				}
		}
		System.out.println(aLI);
	}
}
