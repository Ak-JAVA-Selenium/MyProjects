package Function_or_Method; 	
			// Function/method....Static..
public class test5 {
	    /*  s   =   simple interest
			P	=	initial principal balance
			r   =	annual interest rate
			t	=	time (in years)       */
	public static double demo(double p,double r,double t) {
		return (p*r*t)/100;
	}
	private static double demo1(double p,double r,double t) {
		double res = (p*r*t)/100;
		return res;
	}
	protected static double demo2(double p,double r,double t) {
		double res = (p*r*t)/100;
		System.out.println("SimpleInt ="+res);
		return res;
	}
	public static void demo3(double p,double r,double t) {
		double res = (p*r*t)/100;
		System.out.println("SimpleInt ="+res);
	}
	public static void main(String[] args) {
		
		System.out.println("SimpleInt ="+demo(250000, 6.5, 5));
		System.out.println("SimpleInt ="+demo1(350000, 5, 3));
		
		demo2(250000, 6.5, 5);
		test5.demo2(350000, 5, 3);
		
		demo3(250000, 6.5, 5);
		test5.demo3(350000, 5, 3);
	}
}
