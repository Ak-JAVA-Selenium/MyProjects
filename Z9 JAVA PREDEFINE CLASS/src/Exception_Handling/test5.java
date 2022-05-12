package Exception_Handling;

//unhandled exception in program
public class test5 {

	public static void main(String[] args) {

		try {

			System.out.println("Inside the try block");

			// below code throws divide by zero exception
			int data = 25 / 0;
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null Pointer type exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		// executes regardless of exception occured or not
		finally {
			System.out.println("I am inside finally block");
			try {
				int k = 10 / 0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally block is always executed");
		}

		System.out.println("rest of the code...");
	}
}