package Loops_In_JAVA;
							// Loop.......While loop...

public class test5 {

	public static void main(String[] args) {

		int i = 1;
		System.out.println("Printing numbers from 1 to 15");
		while (i <= 15) {
			System.out.println(i + " ");
			i++;
		}
//=============================================================
		int i2 = 10;
		System.out.println("Printing numbers from 10 to 0");
		while (i2 >= 0) {
			System.out.println(i2);
			i2--;
		}
//=============================================================
		char c1 = 'a';
		while (c1 <= 'z') {
			System.out.print(c1 + " ");
			c1++;
		}
		System.out.println("\n***Reverse***");
		char c2 = 'z';
		while (c2 >= 'a') {
			System.out.print(c2 + " ");
			c2--;
		}
	}
}
