package All_Topic_Practice;

class main1 {
	public static void UnaryOperators() {
		// Pre & Post Increment & Decrement Operators...
		// pre : first perform the operation then use the updated value
		// post: first use the value then perform the operation

		int a = 0, b;
		b = a++ + ++a + ++a + a;
		// 0 + 2 + 3 + 3 = 8
		System.out.println(a);// 3
		System.out.println(b);// 8

		a = 0;
		b = a-- + --a + --a + a;
		// 0 + -2 + -3 + -3 = -8
		System.out.println(a);// -3
		System.out.println(b);// -8

		a = 0;
		b = --a + --a + --a + a + ++a + a++;
		// -1 + -2 + -3 + -3 + -2 + -2 =
		System.out.println(a);// -1
		System.out.println(b);// -13

		a = 0;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		// 0 + -1 + 0 + 0 + 2 + 2 + 3 = 6
		System.out.println(a);// 3
		System.out.println(b);// 6
	}
}

public class Operators_Unary {

	public static void main(String[] args) {

		main1.UnaryOperators();
	}
}
