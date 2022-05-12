package Function_or_Method;
						// Non-staticMethod..method overloading
public class test92 {

	public void square() {
		System.out.println("No Parameter Method Called");
	}
	public void square(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}
	public void square(float number) {
		float square = number * number;
		System.out.println("Method with float Argument Called:" + square);
	}
	public static void main(String[] args) {
		
		test92 obj = new test92();		
		obj.square(2.5f);
		obj.square();
		obj.square(5);
	}
}
