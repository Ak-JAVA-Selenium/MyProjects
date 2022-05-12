package Constructor_Overloading;

public class test {

	test() {
		System.out.println("This is a zero-para constructor");
	}

	test(char c) {
		System.out.println("This is a single-para constructor");
	}

	test(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}

	test(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	}

	test(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	}

	test(double num1, boolean num2, char c) {
		System.out.println("This is a double-int parameterized constructor");
	}

	public static void main(String[] args) {
		
		test c1 = new test();
		test c2 = new test(10, 20);
		test c3 = new test('d');
		test c4 = new test(10d, 20);
		test c5 = new test(10, 20.45);
	}
}
/*
 * Constructor Overloading: more than one constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 * 
 */


