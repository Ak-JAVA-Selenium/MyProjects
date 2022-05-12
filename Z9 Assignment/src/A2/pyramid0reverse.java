package A2;

public class pyramid0reverse {

	public static void py() {
		int ct = 12;
		for (int i = 10; i >= 0; i--) {
			ct--;
			System.out.println();
			for (int x = 1; x <= ct; x++) {
				System.out.print(x + " ");
			}
		}
	}
	public static void py1() {
		int ct = 0;
		for (char i = 'J'; i >= 'A'; i--) {
			ct++;
			System.out.println();
			for (int x = 10; x >= ct; x--) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {

		int ct = 0;
		for (int i = 10; i >= 0; i--) {
			ct++;
			System.out.println();
			for (int x = 10; x >= ct; x--) {
				System.out.print(" * ");
			}
		}
		pyramid0reverse.py();
		System.out.println();
		pyramid0reverse.py1();
	}
}
