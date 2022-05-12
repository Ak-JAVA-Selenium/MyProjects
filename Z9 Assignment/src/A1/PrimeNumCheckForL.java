package A1;

public class PrimeNumCheckForL {

	public static void prime(int i) {

		int counter = 0;
		for (int num = i; num >= 1; num--) {
			if (i % num == 0) {
				++counter;
			}
		}
		if (counter == 2) {
			System.out.println("This is Prime Number: " + i);
		} else {
			System.out.println("This is not Prime Number: " + i);
		}
	}

	public static void main(String[] args) {

		PrimeNumCheckForL.prime(11);

		PrimeNumCheckForL.prime(50);
	}
}
