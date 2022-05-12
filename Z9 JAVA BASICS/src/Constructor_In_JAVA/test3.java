package Constructor_In_JAVA;

public class test3 {
	
	void display() {
		System.out.println("I am display() of class Cons5.\n");
	}
	public static void main(String args[]) {
		System.out.println("Main() of Class Cons5 is started...\n");
		demo1 a1 = new demo1();
		a1.display();
		System.out.println("Class A global varibale i = " + a1.i+"\n");
		demo2 x1 = new demo2();
		x1.display();
		System.out.println("Class X global varibale j = " + x1.j+"\n");
		test3 c1 = new test3();
		c1.display();
		System.out.println("Main() of Class Cons5 is ends here...\n");
	}
}
class demo1 {
	int i = 10;

	demo1() {
		System.out.println("Running Class A() constructor..\n");
	}
	void display() {
		System.out.println("I am display() of class A.\n");
	}
}
class demo2 {
	int j = 20;

	demo2() {
		System.out.println("Running Class X() constructor..\n");
	}
	void display() {
		System.out.println("I am display() of class X.\n");
	}
}
