package Encapsulation_Modifiers_Pakage;

// Private members/modifiers can access within class only..........

class PrivateMembers {

	private int accNum = 12345;

	private void displayAccNum() {

		System.out.println("Account Number: " + accNum);
	}

	public static void main() {

		PrivateMembers p1 = new PrivateMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}

public class test0 {

	public static void main(String[] args) {

		PrivateMembers p1 = new PrivateMembers();
// Error
//		System.out.println(p1.accNum);
//		p1.displayAccNum();
	}
}
