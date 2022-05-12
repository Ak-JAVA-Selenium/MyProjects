package Constructor_In_JAVA;

public class test6 {
	test6() {
		System.out.println("This is a zero-para constructor");
	}
	test6(char c) {
		System.out.println("This is a single-para constructor");
	}
	test6(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}	
	test6(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	}
	test6(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	}
	test6(double num1, boolean num2,char c) {
		System.out.println("This is a double-int parameterized constructor");
	}
	public static void main(String[] args) {
		test6 c1 = new test6();
		test6 c2 = new test6(10, 20);
		test6 c3 = new test6('d');
		test6 c4 = new test6(10d, 20);
		test6 c5 = new test6(10, 20.45);
	}
}
/**
 * Constructor Overloading: more than one constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */

