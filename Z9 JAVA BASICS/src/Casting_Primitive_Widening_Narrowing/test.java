package Casting_Primitive_Widening_Narrowing;

public class test {

	public static void main(String[] args) {

		int myInt = 9;
		double myDouble = myInt; // implicit widening
		double d = (double) myInt; // explicit widening
		System.out.println(myInt); //
		System.out.println(myDouble); //
		System.out.println(d);//

		double salary = 23400.67856856898989545d;
		int sal = (int) salary;// Narrowing double--->int,explicit
		long f = (long) salary;// Narrowing double--->long, explicit
		System.out.println("Actual Salary: " + salary);
		System.out.println("Int Salary: " + sal);
		System.out.println("long Salary: " + f);
	}
}