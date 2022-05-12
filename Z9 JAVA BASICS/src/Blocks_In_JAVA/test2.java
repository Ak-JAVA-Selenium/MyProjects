package Blocks_In_JAVA;

public class test2 {

	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}

	public static void main(String[] args) {

		System.out.println("main() Starts");
		test2 b1 = new test2();
		System.out.println("---------------------------------");
		test2 b2 = new test2();
		System.out.println("main() ends");
	}

	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}
}
