package A1;

public class ReverseNumFor {

	public static int reverse(int x) {

		int rev = 0, rem;

		for (int i=x;i != 0;i=i/10) {

			rem = i % 10;

			rev = rev * 10 + rem;

		}
		System.out.println("Revers Number : " + rev);

		return rev;
	}

	public static void main(String[] args) {

		ReverseNumFor.reverse(99887766);
	}
}
