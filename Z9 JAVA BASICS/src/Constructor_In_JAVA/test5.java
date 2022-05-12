package Constructor_In_JAVA;

public class test5 {

	public static void main(String args[]) {

		System.out.println("Main() of Class Cons7 is started...");
		demo3 b1 = new demo3();
		System.out.println("Class B global varibale i = " + b1.i);
		System.out.println("======================================");
		demo3 b2 = new demo3();
		System.out.println("Class B global varibale i = " + b2.i);
		System.out.println("Main() of Class Cons7 is ends here...");
	}
}
class demo3 {
	int i = 10;

	demo3() {
		System.out.println("Running Class B constructor..");
		i = 23;
	}
}
