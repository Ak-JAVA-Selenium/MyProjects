package A2;

public class pyramid2reverse {

	public static void main(String[] args) {

		int ct = 10;
		for (int i = 17; i >= 1; i--) {

			if (i % 2 != 0) {

				for (int c = i; c < 17; c++) {

					System.out.print(" ");
				}
				ct = ct - 1;
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
