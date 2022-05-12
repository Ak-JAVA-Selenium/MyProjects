package Demo_Practice;

public class Recurring_Deposit_Caltn {

	public static void main(double p,double r,double t) {
		
		double si,amt,sum;
		si = ((p*(t*(t+1)))*r)/(2*100);
		amt = p * t;
		sum = amt + si;
		System.out.println("principle = "+amt);
		System.out.println("Interest = "+si);
		System.out.println("Maturity = "+sum);
	}
	
	public static void main(String[] args) {

		Recurring_Deposit_Caltn.main(14003, 6, 21);
	}
}
