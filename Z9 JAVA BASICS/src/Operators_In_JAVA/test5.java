package Operators_In_JAVA;

public class test5 {

	public static void main(String[] args) {

		int a = 25, b;
		b = a++ + ++a + ++a + a; //
		// b = 25 + 27 + 28 + 28
		System.out.println("a: " + a); // 28
		System.out.println("b: " + b); // 108
		
		a = -8;
		b = a-- + --a + --a + a;
		// b = -8 + -10 + -11 + -11
		System.out.println("a: " + a); // -11
		System.out.println("b: " + b); // -40

		a = 20;
		b = --a + --a + --a + a + ++a + a++;
		// b = 19 + 18 + 17 + 17 + 18 + 18
		System.out.println(a); // 19
		System.out.println(b); // 107

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		// b= -2 + -1 + 0 + 0 + 2 + 2 + 3
		System.out.println(a); // 1
		System.out.println(b); // -8
	}
}
