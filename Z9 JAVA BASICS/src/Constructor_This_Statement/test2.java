package Constructor_This_Statement;

public class test2 {

	test2() {
		this(25.36);
		System.out.println("hello zero");
	}

	test2(double d) {
		this(15);
		System.out.println("hello double " + d);
	}

	test2(int x) {
		System.out.println("Hello int " + x);
	}
}

class ThisStatement1 {
	
	public static void main(String args[]) {
		
//		 test2 a1=new test2();
//		 test2 a2=new test2(10);
//		 test2 a3=new test2(10.23);
		// or
		test2 a1 = new test2();
	}
}
/**
 * this()---> statement
 * this(): used to call another constructor of current class based on its argument
 * this(): should be the first statement inside the constructor body
 */

