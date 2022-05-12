package A2;

public class pyramid4 {

	public static void py() {
		int ct = 0, y = 1;
		for (int i = 1; i <= 10; i++) {
			ct++;
			int x = 1;
			while (x <= ct) {
				if (y < 10) {
					System.out.print(y + "   ");
				} else if (y < 99) {
					System.out.print(y + "  ");
				}
				y = y + 1;
				x++;
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {

		pyramid4.py();
	}
}
