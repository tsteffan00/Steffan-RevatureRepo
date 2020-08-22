package indivCoreJava;

public class Driver {
    public static void main(String args[]) {
    	System.out.println("Question: One");
    	QuestionOne.primarySort();
    	System.out.println("\n");
    	
    	System.out.println("Question Two");
    	QuestionTwo.fibEquation();
    	System.out.println("\n");
    	
    	System.out.println("Question Three");
    	QuestionThree.reversal();
    	System.out.println("\n");

    	System.out.println("Question Four");
    	QuestionFour.factorialCalc(6);
    	System.out.println("\n");
    	
    	System.out.println("Question Five");
    	QuestionFive.substringMethod("Antidisestablishmentarianism.", 10);
    	System.out.println("\n");
    	
    	System.out.println("Question Six");
    	QuestionSix.remainderTest(13);
    	System.out.println("\n");
    	
    	System.out.println("Question Seven");
    	QuestionSeven.comparatorSort();
    	System.out.println("\n");
    	
    	System.out.println("Question Eight");
    	QuestionEight.q8Run();
    	System.out.println("\n");
    	
    	System.out.println("Question Nine");
    	QuestionNine.fillAndPrint();
    	System.out.println("\n");
    	
    	System.out.println("Question Ten");
    	QuestionTen.ternaryOperation();
    	System.out.println("\n");
    	
    	System.out.println("Question Eleven");
    	QuestionEleven.longRange();
    	System.out.println("\n");
    	
    	System.out.println("Question Twelve");
    	QuestionTwelve.enhancedFill();
    	System.out.println("\n");
    	
    	System.out.println("Question Thirteen");
    	QuestionThirteen.pyramid();
    	System.out.println("\n");
    	
    	System.out.println("Question Fourteen");
    	QuestionFourteen.switchCase();
    	System.out.println("\n");
    	
    	System.out.println("Question Fifteen");
    	QuestionFifteen.StdCalc();
    	System.out.println("\n");
    	
    	System.out.println("Question Sixteen");
    	QuestionSixteen.stringCounter(args);
    	System.out.println("\n");   	
    	
    	System.out.println("Question Seventeen");
    	QuestionSeventeen.simpleInterest();
    	System.out.println("\n");
    	
    	System.out.println("Question Eighteen");
    	QuestionEighteenConcSub q18obj = new QuestionEighteenConcSub();
    	q18obj.caseCheck();
    	q18obj.convertToUpper();
    	q18obj.convertToInt();
    	System.out.println("\n");
    }
}
