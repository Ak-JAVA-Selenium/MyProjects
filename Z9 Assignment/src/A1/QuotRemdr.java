package A1;

public class QuotRemdr {

	public static int dividend(int num1, int num2) {
		int rem = num1 % num2;
		int quot = (num1 - rem) / num2;
		System.out.println("Num1 = " + num1 + "\nNum2 = " + num2);
		System.out.println("Quotient = " + quot + "\nRemainder = " + rem);
		return quot;
	}

	public static void main(String[] args) {

		QuotRemdr.dividend(11, 2);

	}
}
