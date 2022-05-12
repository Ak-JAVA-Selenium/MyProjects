package Variable_Final_Variable;

public class test3 {
	
	// Final Local Variable......

	public static void main(String[] args) {
		
		// Area = pi*r*r;
		int r=50;
		final double pi;  // here 'pi' is a local variable,hence its value can be initialize before use as well....
		
		System.out.println("Radius is: "+r);
		
		pi=3.14;          // but ones value of variable initialized it can not be changed.....
		double area = pi*r*r;
		
		System.out.println("Area of circle is: "+area);
	}

}
