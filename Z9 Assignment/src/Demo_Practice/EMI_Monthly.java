package Demo_Practice;

public class EMI_Monthly {

	// P = principle amount,
	// R = annual rate of interest
	// N = tenure in number of years

	public static void emi(double P, double R, double N) {
		System.out.println("Principle Amount = " + P + " Rs\n\nAnnual Rate of Interest = " + R
				+ " %\n\nTenure in Number of Months = " + N);
		double r, emi, ints;
		int i, emi1, ints1, prin, p = (int) P, tolint = 0;
		r = R / (12 * 100);
		emi = ((p * r) * (Math.pow((1 + r), N))) / ((Math.pow((1 + r), N)) - 1);
		emi1 = (int) emi;
		System.out.println("\nMonthly EMI = " + emi1 + "\n");
		System.out.println("Loan EMI Table :\n");
		System.out.println("Principle   Interest   Outstanding");
		System.out.println("Amount      Amount     Principle  \n");
		for (i = 1; i <= N; i++) {
			ints = p * r;
			ints1 = (int) ints;
			prin = emi1 - ints1;
			p = p - prin;
			tolint = tolint + ints1;
			if (ints < 99) {
				System.out.println(" " + prin + "\t     " + ints1 + "         " + p);
			} else if (ints < 999) {
				System.out.println(" " + prin + "\t     " + ints1 + "        " + p);
			} else {
				System.out.println(" " + prin + "\t     " + ints1 + "       " + p);
			}
		}
		System.out.println("\nTotal Interest Payable = " + tolint);
		System.out.println("\nTotal Payment \n( Principle+Interest )  = " + (tolint + P));
	}

	public static void main(String[] args) {

		EMI_Monthly.emi(50000, 14, 12);
	}
}
