package Operators_In_JAVA;

public class test2 {
	
	public static boolean logic(int a) {

		boolean res1, res2;
		res1 = (a > 18);
		res2 = (a < 60);
		boolean res3 = (res1 && res2);
		System.out.println("Age = " + a );
		return res3 ;
	}
	public static void main(String[] args) {
		
		boolean res4 = test2.logic(15);
		System.out.println("Result1 = " + res4 );
		
		res4 = test2.logic(25);
		System.out.println("Result2 = " + res4 );
		
		res4 = test2.logic(55);
		System.out.println("Result3 = " + res4 );
		
		res4 = test2.logic(75);
		System.out.println("Result4 = " + res4 );
	}
}