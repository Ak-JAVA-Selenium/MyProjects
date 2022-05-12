package A1;

public class FactorsNegative {

	public static void factor(int x) {

		System.out.println("Given Number : " + x + "\nFactors are : ");

		int count = 0, y = -(x);
		for (int i = x; i <= y; i++) {
			if (i != 0 && x % i == 0) {
				++count;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nNumber of factors = " + count);
	}

	public static void main(String[] args) {

		FactorsNegative.factor(-48);
		System.out.println("====================================");
		FactorsNegative.factor(-60);
	}
}
