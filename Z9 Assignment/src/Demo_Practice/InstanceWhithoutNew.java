package Demo_Practice;

class h {

	public void validateAge(int age) {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
			System.out.println(age);
		}
	}
}

//Throwing Unchecked Exception
public class InstanceWhithoutNew {

	static h reff;
	// function to check if person is eligible to vote or not
//		public static void validateAge(int age) {
//			if (age < 18) {
//				// throw Arithmetic exception if not eligible to vote
//				throw new ArithmeticException("Person is not eligible to vote");
//			} else {
//				System.out.println("Person is eligible to vote!!");
//			}
//		}

	// main method
	public static void main(String args[]) throws Exception {

		Class<h> ref = h.class;
		h l = ref.newInstance();
		l.validateAge(40);

		h refff = (h) Class.forName("h").newInstance();
//		h reff = (h) refff.newInstance();
		refff.validateAge(55);
		
		

//			reff.validateAge(40);
//			reff= (h) reff.getClass().getClassLoader().loadClass("h").newInstance();
//			reff.validateAge(50);

		// calling the function
//			validateAge(23); //without handling the exception

		System.out.println("==============================");

//			try {
//				validateAge(10);
//			} catch (ArithmeticException e) {
//				System.out.println("Exception handled...");
//				System.out.println(e);
//			}
		System.out.println("rest of the code...");
	}
}
