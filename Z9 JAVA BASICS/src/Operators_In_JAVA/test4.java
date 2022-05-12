package Operators_In_JAVA;			// Unary operators........Pre & Post Increment & Decrement Operators...

public class test4 {

	public static void main(String[] args) {
		
		int a = 40, b;
		b = a++;
		System.out.println(a);	//41 
		System.out.println(b);	//40
		
		int x = a, y;
		System.out.println(x);	//41
		
		y = ++x;
		System.out.println(x);	//42 
		System.out.println(y);	//42 

		int p = 20, q = 35, res;
		
		res = p++ + --q;
		System.out.println("res: " + res); //54
		System.out.println("p: " + p);	   //21 
		System.out.println("q: " + q);	   //34
		
		int res1 = ++p + ++q;
		System.out.println("res: " +res1);		//57 
		System.out.println("p: " + p);  //22 
		System.out.println("q: " + q);  //35
	}
}
