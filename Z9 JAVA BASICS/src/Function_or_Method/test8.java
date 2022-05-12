package Function_or_Method;
					// SGV & StaticMethod..method overloading
public class test8 {
	
	static double res;       // SGV...
	
	static public void square() {
		System.out.println("No Parameter Method Called =");
	}
	static public void square(int number) {
		res = number * number;
		System.out.println("Method with Integer Argument Called =" + res);
	}
	static public void square(double number) {
		res = number * number;
		System.out.println("Method with float/double Argument Called =" + res);
	}
	public static void main(String[] args) {
		
		System.out.println("SGV ="+res);
		test8.square();
		test8.square(50);
		test8.square(25.25);
	}
}
