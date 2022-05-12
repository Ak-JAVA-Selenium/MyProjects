package Abstraction_Interface;

interface Printable2 {
	void print();
}

interface Showable2 extends Printable2 {
	void show();
	// public abstract void print(); ---> inherited method
}

class Interface5 implements Showable2 {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public void show2() {
		System.out.println("hi");
	}
}

public class test3 {

	public static void main(String[] args) {

		Printable2 obj2 = new Interface5();
		obj2.print();

		Showable2 obj3 = new Interface5();
		obj3.print();
		obj3.show();

		Interface5 obj = new Interface5();
		obj.print();
		obj.show();
		obj.show2();
	}
}
