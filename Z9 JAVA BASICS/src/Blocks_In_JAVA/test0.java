package Blocks_In_JAVA;

public class test0 {

	/* static block or SIB */
	static {
		System.out.println("running static-block-1 of class..");
	}

	public static void main(String[] args) {

		System.out.println("main() Starts");
		System.out.println("I am main() of class...");
		System.out.println("main() ends");
	}

	/* static block or SIB */
	static {
		System.out.println("running static-block-2 of class..");
	}
}
