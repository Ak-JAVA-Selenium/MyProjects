package Constructor_In_JAVA;

public class test4 {

	public static void main(String args[]) {

		System.out.println("Main() of Class Cons6 is started...");
		demo b1 = new demo(15);
		System.out.println("Class C global varibale i = " + b1.i);//
		System.out.println("======================================");
		demo b2 = new demo(0.32);
		System.out.println("Class C global varibale i = " + b2.i);//
		System.out.println("Main() of Class Cons6 is ends here...");
	}
}
class demo {

	double i = 10.23;

	demo(double j) {
		System.out.println("Running Class C constructor..");
		i = j;
	}
}
