package A1;

public class PolindromeNumWhileL {
	
	public static int polindrome(int x) {

		int rev = 0, num = x, rem;

		while (num != 0) {

			rem = num % 10;

			rev = rev * 10 + rem;

			num = num / 10;
		}
		if (x == rev) {
			System.out.println("This is Polindrome Number : " + rev);
		} else {
			System.out.println("This is not Polindrome Number : " + rev);
		}
		return rev;
	}

	public static void main(String[] args) {
		
		PolindromeNumWhileL.polindrome(121);
		
		PolindromeNumWhileL.polindrome(400004);
	}
}
