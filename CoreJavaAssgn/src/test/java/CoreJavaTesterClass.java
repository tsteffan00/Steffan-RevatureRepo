
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import indivCoreJava.*;


public class CoreJavaTesterClass {
	QuestionOne q1obj = new QuestionOne();
	
	//Q1Test needs to return the correctly sorted array.
	@Test
	public void testQuestionOne() {
        int sample[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
        int answer[] = {0, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9}; 
		Assertions.assertArrayEquals(answer, q1obj.bubbleSort(sample));
	}
	
	//Q2Test needs to print the first 25 Fibonacci numbers.
	@Test
	public void testQuestionTwo() {
		int[] fibExpect = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ,55, 89, 144, 
				233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 
				28657, 46368};
		Assertions.assertArrayEquals(fibExpect, QuestionTwo.fibEquation());
	}
	
	//Q3Test input string should return reversed.
	@Test public void testQuestionThree() {
		Assertions.assertEquals("sgnihT", QuestionThree.reversal("Things"));
	}
	
	//Q4Test needs to return the factorial of the passed in integer.
	
	//Q5Test
	
	//Q6Test
	
	//Q7Test
	
	//Q8Test
	
	//Q9Test
	
	//Q10Test
	
	//Q11Test
	
	//Q12Test
	
	//Q13Test

	//Q14Test
	
	//Q15Test
	
	//Q16Test
	
	//Q17Test
	
	//Q18Test
	
	//Q19Test
	
	//Q20Test
	
}
