package Exception_Handling;

//Throwing Unchecked Exception
public class test7 {
	
	// function to check if person is eligible to vote or not
	public static void validateAge(int age) {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	// main method
	public static void main(String args[]) {
		// calling the function
		validateAge(23); //without handling the exception

		System.out.println("==============================");
		
//		try {
//			validateAge(10);
//		} catch (ArithmeticException e) {
//			System.out.println("Exception handled...");
//			System.out.println(e);
//		}
		System.out.println("rest of the code...");
	}
}
