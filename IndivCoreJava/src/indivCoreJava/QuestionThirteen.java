package indivCoreJava;

public class QuestionThirteen {
	
	public static void pyramid() {
		int n = 0;
		for (int lineCounter = 1; lineCounter < 5; lineCounter++) {
			for (int binCounter = 0; binCounter < lineCounter; binCounter++) {
				System.out.print(n);
				n = n ^ 1;
			}
			System.out.println();
		}
	}
}
