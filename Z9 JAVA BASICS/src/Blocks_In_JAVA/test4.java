package Blocks_In_JAVA;

public class test4 {
	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class Blocks2..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}

	public static void main(String[] args) {
		System.out.println("main() Starts");
		test4 b1 = new test4();
		System.out.println("---------------------------------");
		test4 b2 = new test4();
		System.out.println("main() ends");
	}

	/* static block or SIB */
	static {
		System.out.println("running static-block-2 of class Blocks2..");
	}
	/* non-static block or IIB */
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}
}
