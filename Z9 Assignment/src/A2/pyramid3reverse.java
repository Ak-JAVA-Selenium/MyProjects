package A2;

public class pyramid3reverse {

	public static void main(String[] args) {

		int nt = 6;
		for (int i = 10; i >= 1; i--) {

			if (i % 2 != 0) {

				for (int c = i; c < 10; c++) {

					System.out.print(" ");
				}
				nt = nt - 1;
				for (int x = nt; x < i; x++) {

					System.out.print(x + " ");
				}
				for (int y = i; y >= nt; y--) {

					System.out.print(y + " ");
				}
				System.out.println("\n");
			}
		}
	}
}
