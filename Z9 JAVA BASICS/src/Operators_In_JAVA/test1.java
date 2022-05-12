package Operators_In_JAVA;
								//operators....logical operators ( &&, ||, ! )
public class test1 {
	public static void main(String[] args) {
		
		int age = 17;
		char BloodGr = 'c';
		
		boolean res1, res2;
		res1 = (age > 18);
		res2 = (BloodGr == 'A');
		
		System.out.println(" Result1: " + res1);
		System.out.println(" Result2: " + res2);
		
		// Logical AND
		System.out.println("\n bool1 && bool2 = " + (res1 && res2));

		// Logical OR
		System.out.println("\n bool1 || bool2 = " + (res1 || res2));

		// Logical Not
		System.out.println("\n !(bool1 && bool2) = " + !(res1 && res2));
	}
}
// Logical AND :
//	true  + true  = true
//	true  + false = false
//	false + false = false

// Logical OR :
//  true  + true  = true
//  true  + false = true
//  false + false = false

// Logical Not :
//  true  + true  = false
//  true  + false = true
//  false + false = true

