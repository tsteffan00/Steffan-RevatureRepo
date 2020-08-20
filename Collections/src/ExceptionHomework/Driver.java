package ExceptionHomework;

public class Driver {
	public static void ThrowException() throws HomeworkException {
		throw new HomeworkException("Oops.");
	}
		
	public static void main(String[] args) {
		try {
			ThrowException();
		}
		catch (HomeworkException e) {
			System.out.println("Or have you?");
		}
	}
}
