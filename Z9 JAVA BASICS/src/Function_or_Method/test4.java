package Function_or_Method;

public class test4 {
	
	// Function/Method..........datatypes
	
	private static double Addition(double num1,double num2) {
		double sum = num1 + num2;
		System.out.println("Addition Result "+sum);  // if print statement already add in function...
		return sum;
	}
	public static void main(String[] args) {
		
		Addition(151, 49);        /* We can print directly using given STD calling..*/     
		
		test4.Addition(251, 49);	
	}

}
