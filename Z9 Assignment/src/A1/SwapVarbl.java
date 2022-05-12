package A1;

public class SwapVarbl {

	public static void method1(int x, int y) {

		System.out.println("x=" + x + "\ty=" + y);
		System.out.println("Swapping :");
		int temp;
		temp = x + y;
		x = temp - x;
		y = temp - y;
		System.out.println("x=" + x + "\ty=" + y);
	}

	public static void method2(int x, int y) {

		System.out.println("x=" + x + "\ty=" + y);
		System.out.println("Swapping :");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x=" + x + "\ty=" + y);
	}

	public static void main(String[] args) {

		SwapVarbl.method1(333, 777);
		System.out.println("========================");
		SwapVarbl.method1(-54, -96);
		System.out.println("========================");
		SwapVarbl.method1(50, -200);
		System.out.println("========================");
		SwapVarbl.method1(-450, 78);
		System.out.println("========================");

		SwapVarbl.method2(125, 28);
		System.out.println("========================");
		SwapVarbl.method2(-95, -155);
		System.out.println("========================");
		SwapVarbl.method2(500, -20);
		System.out.println("========================");
		SwapVarbl.method2(-112, 900);
	}
}
