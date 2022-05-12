package All_Topic_Practice;
// Function or Method ( Static Method )
public class Method_Static {
	/**
	 * access modifiers :- 	   private,default,protected,public 
	 * non-access modifiers:-  static or non-static 
	 * return type :- 		   void & all datatypes 
	 * method name :- 		   info(anything) 
	 * parameters/arguments:-  age,salary,vehicle (variables with datatypes)
	 */
	public static void m1(int age) {
		System.out.println("Hi");
		System.out.println("I am " + age + " year old");
		return; // Optional & method (void) can not return any value.
	}
	public static void demo(double p,double r,double t) {
		double res = (p*r*t)/100;
		System.out.println("SimpleInt ="+res);
	}
	private static double Addition(double num1,double num2) {
		double sum = num1 + num2;
		return sum;
	}
	public static void main(String[] args) {
//m1
		m1(30); // MethodName.....
		Method_Static.m1(32); // ClassName.MethodName.....
		// output can not print in statement or reuse because of no return value from method
//demo		
		demo(250000, 6.5, 5);
		Method_Static.demo(350000, 5, 3);
//Addition
		Addition(31, 31);
		// Execute but can't give value.
		Method_Static.Addition(21, 21);	
		
		System.out.println("Addition Result "+Addition(151, 49));
		System.out.println("Addition Result "+Method_Static.Addition(251, 49));
	
		double result = Addition(51, 49);
		// output(method return value) can store for reuse.
		System.out.println("Addition Result "+result);	
	}
}
