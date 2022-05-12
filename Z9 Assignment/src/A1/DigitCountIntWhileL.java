package A1;

public class DigitCountIntWhileL {

	public static void digits(int x) {

		int count = 0;
		if (x >= 0) {
			int i = x;
			while (i >= 0) {
				i = i / 10;
				++count;
			}
		}
		if (x < 0) {
			int i = x;
			while (i < 0) {
				i = i / 10;
				++count;
			}
		}
		System.out.println("Number = " + x);
		System.out.println("Number of digit = " + count);
	}

	public static void main(String[] args) {

		DigitCountIntForL.digits(476284);
		System.out.println("====================");
		DigitCountIntForL.digits(-476284);
		System.out.println("====================");
		DigitCountIntForL.digits(0);
	}
}
