package Demo_Practice;

public class FibonacciNumberPrint {

	public static void main(String[] args) {

		int x = 1, y = 0, z;
		for (int i = 0; i <= 45; i++) {
			z = x + y;
			System.out.println(z);
			x = y;
			y = z;
		}
	}
}
