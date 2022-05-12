package Operators_In_JAVA;				// Unary operators........Pre & Post Increment & Decrement Operators...
public class test3 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = a;
		
		System.out.println("a: " + a);  //10
		System.out.println("b: " + b);  //10
		
		// pre : first perform the operation then use the updated value 
		// post: first use the value then perform the operation
		
		int k = ++a;
		System.out.println("k: " + k);	//11
		System.out.println("a: " + a);	//11
		
		int j = k++;
		System.out.println("k: " + k);	//12
		System.out.println("j: " + j);	//11

		int r = 21;
		System.out.println("r=: " + r++);	//21
		System.out.println("r=: " + r);	    //22
		System.out.println("r=: " + ++r);	//23
		System.out.println("r=: " + r);		//23

		int x = 105;
		System.out.println("x=: " + --x);	//104
		System.out.println("x=: " + x); 	//104
		System.out.println("x=: " + x--); 	//104
		System.out.println("x=: " + x); 	//105
	}
}
