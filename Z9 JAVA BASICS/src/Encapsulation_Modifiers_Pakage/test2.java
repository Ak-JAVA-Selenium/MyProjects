package Encapsulation_Modifiers_Pakage;

import Function_or_Method.test6;

// Protected members/modifiers can access within package 
// & also outside the package through child class..(Inheritance)

class ProtectedMembers {

	protected int accNum = 12345;

	protected void displayAccNum() {
		System.out.println("Account Number: " + accNum);
	}
}

class OutsidePackage extends test6 {
// (Inheritance)..
	public static void main() {

		/** Outside package class( Function_or_Method == test6 ) **/

		OutsidePackage a = new OutsidePackage();
		a.demo2(100000, 5, 3);
	}
}

public class test2 {

	public static void main(String[] args) {

		ProtectedMembers p1 = new ProtectedMembers();

		System.out.println("Accessing Protected members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		System.out.println("========================");
		OutsidePackage.main();
	}
}
