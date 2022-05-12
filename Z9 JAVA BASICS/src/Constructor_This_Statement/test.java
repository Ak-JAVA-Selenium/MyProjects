package Constructor_This_Statement;

public class test {

	test() {
		System.out.println("******Zero-Param*********");
	}

	test(int age) {
		System.out.println("******int-Param*********");
	}

	test(char c, double d) {
		System.out.println("******char-double-Param*********");
	}

	public static void main(String[] args) {

		test t1 = new test();
		test t2 = new test(25);
		test t3 = new test('c', 25.36);
	}
}
/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside the constructor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 * 
 */

