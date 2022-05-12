package Polymorphism_Compile_Runtime;

public class test_compile {

	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers :" + c);
	}

	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of three numbers :" + c);
	}

	static void sum(int a, int b, int e, int d) {
		int c = a + b + e + d;
		System.out.println("Addition of four numbers :" + c);
	}

	public static void main(String[] args) {

		test_compile.sum(45, 80, 22);
		test_compile.sum(45, 80, 22, 3);
	}
}
