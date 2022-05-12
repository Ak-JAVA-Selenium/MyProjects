package Inheritance_Method_Overriding;

class Parent2 {
	// private methods are not overridden
	private void m1() {
		System.out.println("From parent m1()");
	}

	protected void m2() {
		this.m1();
		System.out.println("From parent m2()");
	}
}

class Child2 extends Parent2 {
	// new m1() method
	// unique to Child class
	private void m1() {
		System.out.println("From child m1()");
	}

	// overriding method
	// with more accessibility
	@Override
	public void m2() {
		this.m1();
		System.out.println("From child m2()");
	}
}

public class test4 {

	public static void main(String[] args) {

		Parent2 obj1 = new Parent2();
		obj1.m2();

		Parent2 obj2 = new Child2();
		obj2.m2();
	}
}
/**
  In java we can increase the visibility of members but we can not decrease it
  possible__(private----> default or protected or public),
  not possible__(public --->default or private or protected)
  private member of parent class can't be overridden.
**/
