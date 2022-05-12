package A2;

public class pyramid0 {

	public static void py() {
		int ct = 0;
		for (int i = 1; i <= 10; i++) {
			ct++;
			System.out.println();
			for (int x = 1; x <= ct; x++) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
	}
	public static void py1() {
		int ct = 0;
		for (char i = 'A'; i <= 'J'; i++) {
			ct++;
			System.out.println();
			for (int x = 1; x <= ct; x++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {

		int ct = 0;
		for (int i = 1; i <= 10; i++) {
			ct++;
			System.out.println();
			for (int x = 1; x <= ct; x++) {
				System.out.print(" * ");
			}
		}
		System.out.println();
		pyramid0.py();
		pyramid0.py1();
	}
}
