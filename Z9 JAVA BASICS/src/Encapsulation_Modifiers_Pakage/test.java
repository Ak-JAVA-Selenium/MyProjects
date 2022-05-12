package Encapsulation_Modifiers_Pakage;

class AccessModifiers {

	private int num1 = 10;
	int num2 = 20;			// default
	protected int num3 = 30;
	public int num4 = 40;

	public static void main(String[] args) {

		AccessModifiers m1 = new AccessModifiers();
		
		System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}

public class test {

	public static void main(String[] args) {

		AccessModifiers m1 = new AccessModifiers();
		
		// System.out.println("private variable: " + m1.num1);
		System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}
