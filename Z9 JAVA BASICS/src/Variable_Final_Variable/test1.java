package Variable_Final_Variable;

public class test1 {
	
	// Final Variable........

	public static void main(String[] args) {
		
		final int empId=123;
		
		System.out.println("EmpId: "+empId);
		
		// empId=456;
		/* compile time error....final variable value can't be changed,after ones it declared */
	}
}
/*
final: is keyword
	 : constant or fixed
	 : variable should be declared final at the declaration time
	 : once its value is initialized that value can not be changed
	 : final variable needs to be initialize at the time of declaration
*/