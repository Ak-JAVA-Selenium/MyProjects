package Blocks_In_JAVA;

public class test3 {

	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class Blocks5..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks5..");
	}

	public static void main(String[] args) {

		System.out.println("main() Starts");
		test3 b1 = new test3();
		System.out.println("---------------------------------");
		test3 b2 = new test3();
		System.out.println("main() ends");
	}
}
