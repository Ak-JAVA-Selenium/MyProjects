package Casting_Primitive_Widening_Narrowing;

public class test1 {

	public static void main(String[] args) {

		double myDouble = 9.78d;
		int myInt = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
	}
}
