package Inheritance_Method_Overriding;

class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}

class Overriding4 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
}

public class test2 {

	public static void main(String args[]) {

		Overriding4 obj = new Overriding4();
		obj.myMethod();
	}
}
