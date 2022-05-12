package Variable_Final_Variable;

public class test5 {
	
	/* Final Non-static global variable */
	/* hence its value needs to be initialize at the time of declaration only */
	final double pi=3.14;
	
	// final double pi;
	/* compile time error as by default 'pi' value is 0.0 based on datatype and also declared as final, 
	   so its value can't be changed.....So,we have to initialize value of variable at time of declaration....*/

	public static void main(String[] args) {
		
		//area=pi*r*r;
		int r=25;
		test5 ref = new test5();    // Instance/object created......
		double area = ref.pi*r*r;   // Standard call for NSGV = RefVariableName.VariableName..(ref.pi)
		
		System.out.println("Radius is: "+r);
		System.out.println("Area of circle is: "+area);
	}
}