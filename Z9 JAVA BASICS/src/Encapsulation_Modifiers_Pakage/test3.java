package Encapsulation_Modifiers_Pakage;

//import Function_or_Method.DisplayOverloading;
import Function_or_Method.test6;

// Public members/modifiers can access anywhere (another class or package) but
// condition is...class which have to access is declared as "public"

class PublicMembers {

	public int accNum = 12345;

	public void displayAccNum() {
		System.out.println("Account Number: " + accNum);
	}

	public void main() {

		PublicMembers p1 = new PublicMembers();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

public class test3 {

	public static void main(String[] args) {

		PublicMembers p1 = new PublicMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
		System.out.println("==========================");
		p1.main();
		System.out.println("==========================");
		/** Outside package class( Function_or_Method == test6 ) **/
		test6 a = new test6();
		System.out.println("SimpleInt =" + a.demo(100000, 5, 1));
		System.out.println("==========================");
		/** Outside package class( Function_or_Method == test94 ) **/
		// DisplayOverloading obj = new DisplayOverloading();
		// Error...because this class (DisplayOverloading) not declared as public
	}
}
