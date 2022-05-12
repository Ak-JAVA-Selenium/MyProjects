package Constructor_Overloading;

public class test0 {

	test0() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}

	test0(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}

	test0(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}

	test0(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int,double,int parameters");
	}

	test0(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double,int,int parameters");
	}

	public static void main(String args[]) {
		
		test0 pc5 = new test0();
		test0 pc1 = new test0(12);
		test0 pc2 = new test0(13.34);
		test0 pc3 = new test0(10, 13.34, 45);
		test0 pc4 = new test0(13.34, 23, 87);
	}
}
/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */

