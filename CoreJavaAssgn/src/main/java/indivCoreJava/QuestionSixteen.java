package indivCoreJava;

public class QuestionSixteen {
	
	public static void stringCounter(String args[]) { // String used: "Domo arigato Mr Roboto"
		int fullLength = 0;
		for (int index = 0; index < args.length; index++) {
			fullLength = fullLength + args[index].length();
		}
		System.out.println("The total sum number of characters of the string is: " + fullLength);
	}
}
