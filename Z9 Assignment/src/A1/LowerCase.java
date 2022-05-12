package A1;

public class LowerCase {

	public static void main(String[] args) {

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n====Reverse order====");

		for (char i = 'z'; i >= 'a'; i--) {
			System.out.print(i + " ");
		}
	}
}
