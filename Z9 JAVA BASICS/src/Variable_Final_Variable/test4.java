package Variable_Final_Variable;

public class test4 {
	
	/* Final static global variable */
	/* hence its value needs to be initialize at the time of declaration only */
	static final double pi=3.14;
	
	// static final double pi;
	/* compile time error as by default 'pi' value is 0.0 based on datatype and also declared as final, 
	   so its value can't be changed.....So,we have to initialize value of variable at time of declaration....*/
	
	public static void main(String[] args) {
		
		//area=pi*r*r;
		int r=30;
		double area = pi*r*r;
		
		System.out.println("Radius is: "+r);
		System.out.println("Area of circle is: "+area);
	}

}
