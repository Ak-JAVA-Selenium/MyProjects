package Demo_Practice;

public class Swapping {

	public static void method1() {
		int x = 300, y = -777, temp;
		temp = x + y;
		x = temp - x;
		y = temp - y;
		System.out.println("value of x=" + x);
		System.out.println("value of y=" + y);
	}

	public static void method2() {
		int x = 25, y = -35;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("value of x=" + x);
		System.out.println("value of y=" + y);
	}

	public static void main(String[] args) {

		Swapping.method1();
	}
}
