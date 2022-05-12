package A1;

public class FactorsPositive {

	public static void factor(int x) {

		System.out.println("Given Number : " + x + "\nFactors are : ");

		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				++count;
				System.out.print(i + " ");
			}
		}
		System.out.println("\nNumber of factors = " + count);
	}

	public static void main(String[] args) {

		FactorsPositive.factor(48);
		System.out.println("====================================");
		FactorsPositive.factor(70);
	}
}
