package A1;

public class UpperCaseAtoZ {

	public static void main(String[] args) {

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n====Reverse order====");

		for (char i = 'Z'; i >= 'A'; i--) {
			System.out.print(i + " ");
		}
	}
}
