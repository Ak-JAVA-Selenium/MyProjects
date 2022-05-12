package Loops_In_JAVA;
							//Assignment...
public class test9 {

	public static int ReverseNum(int x) {

		int rev = 0, rem;

		while (x != 0) {

			rem = x % 10;

			rev = rev * 10 + rem;

			x = x / 10;
		}
		System.out.println("Revers Number : " + rev);

		return rev;
	}

	public static void main(String[] args) {

		test9.ReverseNum(99887766);
	}
}
