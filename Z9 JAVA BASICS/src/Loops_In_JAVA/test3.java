package Loops_In_JAVA;

public class test3 {

	public static void main(String[] args) {

		// Leap years between 1900-2022
		System.out.println("Leap years :");
		int ct=0;
		for (int i = 1900; i <= 2022; i++) {

			if (i % 4 == 0) {
				System.out.println(i);
				ct++;
			}
		}
		System.out.println(ct);
	}
}
