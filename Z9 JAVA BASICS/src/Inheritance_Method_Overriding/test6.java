package Inheritance_Method_Overriding;
					//Static method not a part overriding

class Parent4 {
	// Static method in base class which will be hidden in subclass
	static void m1() {
		System.out.println("From parent " + "static m1()");
	}

	// Non-static method which will be overridden in derived class
	void m2() {
		System.out.println("From parent " + "non-static(instance) m2()");
	}
}

class Child4 extends Parent4 {
	// This method hides m1() in Parent
	static void m1() {
		System.out.println("From child static m1()");
	}

	// This method overrides m2() in Parent
	@Override
	public void m2() {
		System.out.println("From child " + "non-static(instance) m2()");
	}
}

public class test6 {

	public static void main(String[] args) {

		Parent4 obj1 = new Child4();
		obj1.m1();
		// Here overriding works and Child's m2() is called
		obj1.m2();
		Child4.m1();
		Parent4.m1();

		Child4 obj = new Child4();
		obj.m1();
	}
}
