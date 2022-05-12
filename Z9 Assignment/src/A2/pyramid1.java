package A2;

public class pyramid1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 11; i++) {

			if (i % 2 != 0) {

				for (int c = 11; c >= i; c--) {

					System.out.print(" ");
				}
				for (int x = 1; x <= i; x++) {

					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
