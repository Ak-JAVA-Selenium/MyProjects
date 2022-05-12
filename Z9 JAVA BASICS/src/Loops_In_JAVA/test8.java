package Loops_In_JAVA;

public class test8 {

	public static void NumBtwn(int x, int y) {

		System.out.println("*****Start******");

		for (int i = x; i >= y; i--) {
			System.out.println(i + " ");
		}
		System.out.println("******End*******");
	}

	public static void main(String[] args) {

		test8.NumBtwn(999, 989);
	}
}
