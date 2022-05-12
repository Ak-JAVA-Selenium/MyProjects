package Function_or_Method;				// Function/method....Non-static..
public class test6 {
	public double demo(double p,double r,double t) {
	return (p*r*t)/100;
}
	private double demo1(double p,double r,double t) {
	double res = (p*r*t)/100;
	return res;
}
	protected double demo2(double p,double r,double t) {
	double res = (p*r*t)/100;
	System.out.println("SimpleInt ="+res);
	return res;
}
	void demo3(double p,double r,double t) {
	double res = (p*r*t)/100;
	System.out.println("SimpleInt ="+res);
}
	public static void main(String[] args) {
		test6 a = new test6();		// Instance/object created..
		
		System.out.println("SimpleInt ="+a.demo(100000, 5, 1));
		System.out.println("SimpleInt ="+a.demo1(100000, 5, 2));
		
		double b = a.demo(100000, 5, 1);
		double c = a.demo1(100000, 5, 2);
		
		System.out.println("SimpleInt ="+b);
		System.out.println("SimpleInt ="+c);
		
		System.out.println("===========================");
		a.demo(100000, 5, 1);
		a.demo1(100000, 5, 2);
		a.demo2(100000, 5, 3);
		a.demo3(100000, 5, 4);	
}
}