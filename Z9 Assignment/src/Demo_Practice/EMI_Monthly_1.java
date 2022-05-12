package Demo_Practice;

public class EMI_Monthly_1 {

	public static void emi(double P, double R, double N) {
		System.out.println("Principle Amount = " + P + " Rs\n\nAnnual Rate of Interest = " + R
				+ " %\n\nTenure in Number of Months = " + N);
		double r, emi, ints, emi1, ints1, prin, p = (int) P, tolint = 0,gst,gst1,due;
		r = R / (12 * 100);
		emi = ((p * r) * (Math.pow((1 + r), N))) / ((Math.pow((1 + r), N)) - 1);
		emi1 = emi;
		System.out.println("\nMonthly EMI = " + String.format("%.2f", emi1) + "\n");
		System.out.println("Loan EMI Table :\n");
		System.out.println("Principle   Interest   Outstanding");
		System.out.println("Amount      Amount     Principle  \n");
		for (int i = 1; i <= N; i++) {
			ints = p * r;
			ints1 = ints;
			gst = (ints1*0.18);
			gst1=gst;
			prin = emi1 - ints1;
			p = p - prin;
			due= prin +ints1 + gst1;
			tolint = tolint + ints1+gst1;
			if (ints < 99) {
				System.out.println(" " + String.format("%.2f", prin) + "     " + String.format("%.2f", ints1) + "      "
						+ String.format("%.2f", p) + "      "+ String.format("%.2f", gst1)+ "      "+ String.format("%.2f", due));
			} else if (ints < 999) {
				System.out.println(" " + String.format("%.2f", prin) + "     " + String.format("%.2f", ints1) + "     "
						+ String.format("%.2f", p)+ "     "+ String.format("%.2f", gst1)+ "     "+ String.format("%.2f", due));
			} else {
				System.out.println(" " + String.format("%.2f", prin) + "     " + String.format("%.2f", ints1) + "    "
						+ String.format("%.2f", p)+ "    "+ String.format("%.2f", gst1)+ "    "+ String.format("%.2f", due));
			}
		}
		System.out.println("\nTotal Interest Payable = " + String.format("%.2f", tolint));
		System.out.println("\nTotal Payment \n( Principle+Interest )  = " + String.format("%.2f", (tolint + P)));
	}//5459648910426874

	public static void main(String[] args) {

		EMI_Monthly_1.emi(50000, 18, 12);
		// String.format("%.2f", a)
	}
}
