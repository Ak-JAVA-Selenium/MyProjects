package Exception_Handling;

public class test4 {

	public static void main(String[] args) {

		try {
			int data = 25 / 0;
			System.out.println(data);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception handled...");
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
