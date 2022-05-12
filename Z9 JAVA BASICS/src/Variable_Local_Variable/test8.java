package Variable_Local_Variable;

public class test8 {

	public static void main(String[] args) {

		
		/* Simple interest: A= P(1+r*t)
		 * A = final Amount, P = Initial Principle Bal, r = Annual Interest Rate, t = time(years) */
		
		double A,P,r,t;
		P = 3000;
		r = 12/100f; // Rate = 12% ~ 12/100
		t = 2;
		A = P*(1+r*t);
		
		System.out.println("Result = "+A);

	}

}
