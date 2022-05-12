package Demo_Practice;

public class Factors_Any_Num {

	public static void factor(int x) {

		System.out.println("Given Number : " + x + "\nFactors are : ");

		int count = 0, a = 0, b = 0;
		if (x > 0) {
			a = 1;
			b = x;
		} else if (x < 0) {
			a = x;
			b = Math.abs(x);
		} else {
			System.out.println("Every number is a factor of zero (0)");
		}
		for (int i = a; i <= b; i++) {
			if (i != 0 && x % i == 0) {
				++count;
				System.out.print(i + " ");
			}
		}
		if (count != 0) {
			System.out.println("\nNumber of factors = " + count + "\n");
		}else {
			System.out.println("Number of factors =  infinity\n");
		}
	}

	public static void main(String[] args) {

		Factors_Any_Num.factor(0);
		Factors_Any_Num.factor(48);
		Factors_Any_Num.factor(-48);
		Factors_Any_Num.factor(1);
	}
}
