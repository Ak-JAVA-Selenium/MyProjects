package Casting_NonPrimitive_Up_Down;
//Up Casting
class A {
	void test1() {
		System.out.println("Running test1()");
	}
}

class B extends A {
	void test2() {
		System.out.println("Running test2()");
	}
}

class C extends B {
	void test3() {
		System.out.println("Running test3()");
	}
}

public class test1 {

	public static void main(String[] args) {

		System.out.println("Program starts");
		C c1 = new C();
		B b1 = (B) c1;// explicit up-casting
		b1.test1();
		b1.test2();
		// b1.test3();
		System.out.println("Program ends");
	}
}
