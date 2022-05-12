package All_Topic_Practice;
/**
 * In java we can increase the visibility of members but we can not decrease it.
 * 		Flow --> ( private--default--protected--public )
 * 		Possible --> ( private----> default or protected or public ),
 * 		Not possible --> ( public --->default or private or protected )
 * 	Private member of parent class can't be overridden.
 * 	Final methods cannot be overridden.
 *  Static method not a part overriding.
**/
class Parent {
	// private methods are not overridden
	private void m1() {
		System.out.println("From parent m1()");
	}

	protected void m2() {
		System.out.println("From parent m2()");
		this.m1();
	}

	final void m3() {
		System.out.println("From parent Final m3()");
	}

	// Static method in base class which will be hidden in subclass
	static void m4() {
		System.out.println("From parent static m4()");
	}
}

class Child extends Parent {
	// new m1() method unique to Child class
	void m1() {
		System.out.println("From child m1()");
	}

	// overriding method with more accessibility
	@Override
	public void m2() {
		System.out.println("From child m2()");
	}

//  This would produce error....
//	void m3() {
//		System.out.println(""From child final m3()"");
//	}

	// This method hides m1() in Parent
	static void m4() {
		System.out.println("From child static m4()");
	}
}

public class Inheritance_Method_Overriding {

	public static void main(String[] args) {

		Child a = new Child();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		System.out.println("=========================");

		Parent b = new Parent();
		b.m2();
		b.m3();
		b.m4();
		System.out.println("=========================");

		Parent c = new Child();
		c.m2();
		c.m3();
		c.m4();
		System.out.println("=========================");

		Parent d = a;
		d.m2();
		d.m3();
		d.m4();
	}
}
