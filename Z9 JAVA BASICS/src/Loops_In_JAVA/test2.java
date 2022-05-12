package Loops_In_JAVA;
								// Assignment...

public class test2 {

	public static void main(String[] args) {

		// Even number between 1-100
		System.out.print("Even Numbers : ");

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			} else {
			}
		}
		// Odd number between 1-100
		System.out.print("\nOdd Numbers : ");

		for (int i = 1; i < 101; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			} else {
			}
		}
	}
}
