package indivCoreJava;

public class QuestionFifteen implements Q15Interface {
	
	public static void addition(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println("Sum of " + x + " and " + y + " is: " + sum);
	}
	
	public static void subtraction(int x, int y) {
		int difference;
		difference = x - y;
		System.out.println("Diff of " + x + " and " + y + " is: " + difference);
	}
	
	public static void multiplication(int x, int y) {
		int product;
		product = x * y;
		System.out.println("Product of " + x + " and " + y + " is: " + product);
	}
	
	public static void division(double i, double j) {
		double quotient;
		quotient = i / j;
		System.out.println("Quotient of " + i + " and " + j + " is: " + quotient);
	}
	
	public static void StdCalc() {
		addition(10, 20);
		subtraction(10, 20);
		multiplication(10, 20);
		division(10, 20);
	}
}
