package A2;

public class pyramid1reverse {

	public static void main(String[] args) {

		for (int i = 11; i >= 1; i--) {

			if (i % 2 != 0) {

				for (int c = i; c <= 11; c++) {               // for printing space

					System.out.print(" ");
				}
				for (int x = 1; x <= i; x++) {                // for printing *

					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
