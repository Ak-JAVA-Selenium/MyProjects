package Function_or_Method;

public class test2 {
	
	// Function/Method..........void
	
	private static void Addition(double num1,double num2) {
		double sum = num1 + num2;
		System.out.println("Addition Result ="+sum);
	}
	public static void main(String[] args) {
		
		Addition(25, 75); 			// MethodName.....
		
		test2.Addition(255, 245);   // ClassName.MethodName.....
		
		/* We can print directly using given STD calling ^^^ */
		
		// System.out.println("Addition Result ="+Addition(175, 125););
		
		/* But we can't call in print statement because function not given any return value...*/
	}
}
