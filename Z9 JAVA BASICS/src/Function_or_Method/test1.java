package Function_or_Method;

public class test1 {
	
	// Function/Method..........void
	
	public static void info(int age,double salary,int vehicle) {
		
		System.out.println("Hi");
		System.out.println("I am "+age+" year old");
		System.out.println("I am getting "+salary);
		System.out.println("I have "+vehicle+" vehicle");
		System.out.println("================================");
		
		return; // Optional because if you don't write it then java compiler will write it....
	}
	public static void main(String[] args) {
		
		info(25, 25000, 1);
		info(27, 30000, 2);
		info(29, 35000, 3);
		info(30, 40000, 4);           // MethodName.....
		test1.info(32, 45000, 5);	  // ClassName.MethodName.....
	}
}
 /*
 * access modifier     : public
 * non-access modifiers: static
 * return type         : void
 * method name         : info
 * parameters/arguments: age,salary,vehicle
 */