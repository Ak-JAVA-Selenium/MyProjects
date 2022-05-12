package Function_or_Method;
						// Class & StaticMethod..method overloading
public class test93 {

	static void display() {
		System.out.println("I am display() of MethodOverloading3 class");
	}
	public static void main(String[] args) {
		
		display();
		test93.display();
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
	}
}
class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
