package A1;

public class PrimeNumCheckWhileL {

	public static int Prime(int i) {

		int num = i, counter = 0;
		while (num >= 1) {
			if (i % num == 0) {
				++counter;
			}
			num--;
		}
		if (counter == 2) {
			System.out.println("This is Prime Number: " + i);
		} else {
			System.out.println("This is not Prime Number: " + i);
		}
		return i;
	}

	public static void main(String[] args) {

		PrimeNumCheckWhileL.Prime(17);

		PrimeNumCheckWhileL.Prime(57);

		PrimeNumCheckWhileL.Prime(97);
	}
}
