package Function_or_Method;

public class test3 {
	
	// Function/Method..........datatypes
	
	private static double Addition(double num1,double num2) {
		double sum = num1 + num2;
		return sum;
	}
	public static void main(String[] args) {
		
		double result = Addition(51, 49);
		System.out.println("Addition Result "+result);  
		
		System.out.println("Addition Result "+Addition(151, 49));    // Call in print statement using STD calling...
		
		System.out.println("Addition Result "+test3.Addition(251, 49));
		
		Addition(31, 69);
		
		test3.Addition(21, 21);	
	}
}
