package calculator;

import java.util.Scanner;

public class CalcMain {

	System.out.println("Please input your first number.");
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	
	
	public double add(double a, double b) {
		double sum;
		sum = a + b;
		return sum;
	}
	
	public double subtract(double a, double b) {
		double subtraction;
		subtraction = a - b;
		return subtraction;
	}
	
	public double multiply(double a, double b) {
		double product;
		product = a * b;
		return product;
	}
	
	public double divide(double a, double b) {
		double divisor;
		divisor = a / b;
		return divisor;
	}
	
	public int modulo(int x, int y) {
		
	}
}
