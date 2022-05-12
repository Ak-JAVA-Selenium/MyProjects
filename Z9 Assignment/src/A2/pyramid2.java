package A2;

public class pyramid2 {

	public static void main(String[] args) {

		int ct = 0;
		for (int i = 1; i <= 17; i++) {

			if (i % 2 != 0) {

				for (int c = 17; c > i; c--) {

					System.out.print(" ");
				}
				ct = ct + 1;
				for (int x = 1; x < ct; x++) {

					System.out.print(x + " ");
				}
				for (int y = ct; y >= 1; y--) {

					System.out.print(y + " ");
				}
				System.out.println("\n");
			}
		}
	}
}
