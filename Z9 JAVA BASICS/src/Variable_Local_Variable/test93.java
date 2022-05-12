package Variable_Local_Variable;

public class test93 {

	public static void main(String[] args) {
		
		/* Simple interest: A= P(1+r*t)
		   A = final Amount, P = Initial Principle Bal, r = Annual Interest Rate, t = time(years) */
		
		double A,P,r,t;
		P = 5000;
		r = 0.08; // Rate = 8% ~ 8/100
		t = 5;
		A = P*(1+r*t);
		
		System.out.println("Result = "+A);

	}

}
