package Encapsulation_Modifiers_Pakage;

// Default members/modifiers can access only within package

class DefaultMembers {

	int accNum = 12345;

	void displayAccNum() {
		System.out.println("Account Number: " + accNum);
	}
}

public class test1 {

	public static void main(String[] args) {

		DefaultMembers p1 = new DefaultMembers();

		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		System.out.println("================================");
		test1.OutsideClass();
	}

	public static void OutsideClass() {
		/** test class members from current package... **/

		AccessModifiers m1 = new AccessModifiers();

		System.out.println("default variable: " + m1.num2);
	}
}
