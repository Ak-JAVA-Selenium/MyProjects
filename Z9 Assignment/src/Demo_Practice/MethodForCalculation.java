package Demo_Practice;

public class MethodForCalculation {
	
	static int x=10;
	
	public static double addition() {
		int y=20;
		double res= x+y;
		return res;
	}
	public static double subtraction() {
		int y=20;
		double res= y-x;
		return res;
	}
	public static double division() {
		int y=20;
		double res= y/x;
		return res;
	}
	public static void comparision() {
		int y=20;
		if (x>y) {
			System.out.println("X is bigger than Y");}
		else {
			System.out.println("Y is bigger than X");}
	}
	public static void main(String[] args) {
		
		System.out.println("addition ="+addition());
		System.out.println("subtraction ="+subtraction());
		System.out.println("division ="+division());
		comparision();
		int b=10;
		double a = addition()*b;
		System.out.println("multification = (addition res * b) ="+a);
		
	}
}
