package Singleton_Class;

class Singleton1 {
	// Static variable single_instance of type Singleton
	private static Singleton1 single_instance = new Singleton1();
	// Declaring a variable of type String
	public String s;

	// Constructor of this class, Here private constructor is is used to restricted to this class itself
	private Singleton1() {
		s = "Hello I am a string part of Singleton class";
	}

	// Method Static method to create instance of Singleton class
	public static Singleton1 getInstanceOfSingleton() {
		// To ensure only one instance is created
		return single_instance;
	}
}

public class test1 {

	public static void main(String[] args) {

		// Instantiating Singleton class with variable x
		Singleton1 x = Singleton1.getInstanceOfSingleton();
		System.out.println("String from x is: " + x.s);
		// Instantiating Singleton class with variable y
		Singleton1 y = Singleton1.getInstanceOfSingleton();
		System.out.println("String from y is: " + y.s);
		// instantiating Singleton class with variable z
		Singleton1 z = Singleton1.getInstanceOfSingleton();
		System.out.println("String from z is: " + z.s);
		// Now changing variable of instance x via toUpperCase() method
		System.out.println("**********After converting to upper case*********");
		x.s = (x.s).toUpperCase();
		// Print and display commands
		System.out.println("String from x is: " + x.s);
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
		System.out.println("\n");
		// Now again changing variable of instance x
		System.out.println("**********After converting to lower case*********");
		z.s = (z.s).toLowerCase();
		System.out.println("String from x is: " + x.s);
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
	}
}
