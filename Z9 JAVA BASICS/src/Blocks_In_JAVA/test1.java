package Blocks_In_JAVA;
					/* non-static block or IIB */

public class test1 {

	{
		System.out.println("running non-static-block1 of class Blocks3..");
	}

	public static void main(String[] args) {

		System.out.println("main() Starts");
		test1 b1 = new test1();
		System.out.println("---------------------------------");
		test1 b2 = new test1();
		System.out.println("main() ends");
	}
}
