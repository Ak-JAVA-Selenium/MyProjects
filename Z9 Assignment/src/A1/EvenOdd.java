package A1;

public class EvenOdd {

	public static void test(int x) {
		
		System.out.println("Number = " + x);
		
		if (x % 2 == 0) {
			System.out.println("Number is Even = " + x);
		} else {
			System.out.println("Number is Odd = " + x);
		}
	}

	public static void main(String[] args) {

		EvenOdd.test(239);
		EvenOdd.test(998);
	}
}
