package A2;

public class pyramid4reverse {

	public static void py() {
		int y = 46;
		for (int i = 10; i >= 1; i--) {
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
			y = y - i - (i-1);
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {

		pyramid4reverse.py();
	}
}
