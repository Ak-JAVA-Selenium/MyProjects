package A1;

public class PalindromeNumForL {

	public static int polindrome(int x) {

		int rev = 0, rem;

		for (int i = x; i != 0; i = i / 10) {
			rem = i % 10;
			rev = rev * 10 + rem;
		}
		if (x == rev) {
			System.out.println("This is Polindrome Number : " + rev);
		} else {
			System.out.println("This is not Polindrome Number : " + rev);
		}
		return rev;
	}

	public static void main(String[] args) {

		PalindromeNumForL.polindrome(700007);

		PalindromeNumForL.polindrome(1981891);

		PalindromeNumForL.polindrome(16721);
	}
}
