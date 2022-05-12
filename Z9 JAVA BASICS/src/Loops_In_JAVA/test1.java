package Loops_In_JAVA;

public class test1 {

	public static void main(String[] args) {
		
		System.out.println("*****Print in SML*********");

		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		System.out.println("\n*****Print in CAP*********");

		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.print(c1 + " ");
		}
		System.out.println("\n\nReverse");
		
		System.out.println("\n*****Print in SML*********");

		for (char c1 = 'z'; c1 >= 'a'; c1--) {
			System.out.print(c1 + " ");
		}
		System.out.println("\n*****Print in CAP*********");

		for (char c1 = 'Z'; c1 >= 'A'; c1--) {
			System.out.print(c1 + " ");
		}
	}
}
