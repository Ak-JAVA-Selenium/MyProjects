package A2;

public class pyramid3 {

	public static void main(String[] args) {

		int ct = 0, nt = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 != 0) {

				for (int c = 10; c > i; c--) {

					System.out.print(" ");
				}
				nt = nt + 1;
				for (int x = nt; x < i; x++) {

					System.out.print(x + " ");
				}
				ct = ct + 1;
				for (int y = i; y >= ct; y--) {

					System.out.print(y + " ");
				}
				System.out.println("\n");
			}
		}
	}
}
