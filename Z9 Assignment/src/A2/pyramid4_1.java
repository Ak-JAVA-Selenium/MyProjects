package A2;

public class pyramid4_1 {
	
	public static void py() {
		int ct = 0, y = 1;
		for (int i = 1; i <= 7; i++) {
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

	public static void py1() {
		int y = 22;
		for (int i = 7; i >= 1; i--) {
			int x = 1;
			while (x <= i) {
				if (y < 10) {
					System.out.print(y + "   ");
				} else if (y < 99) {
					System.out.print(y + "  ");
				}
				y = y + 1;
				x++;
			}
			y = y - i - (i - 1);
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {

		pyramid4_1.py();
		System.out.println("============inverted===========\n");
		pyramid4_1.py1();
	}
}
