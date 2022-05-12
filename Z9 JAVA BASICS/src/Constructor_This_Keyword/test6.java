package Constructor_This_Keyword;

public class test6 {

	int a;
	int b;

	// Parameterized constructor
	test6(int a, int b) {
		
		this.a = a;
		this.b = b;
	}

	void display() {
		
		// Displaying value of variables a and b
		System.out.println("a = " + a + "  b = " + b);
	}

	public static void main(String[] args) {
		
		test6 object = new test6(10, 20);
		object.display();
		System.out.println(object.a + " " + object.b);
		test6 object2 = new test6(102, 201);
		object2.display();
		System.out.println(object2.a + " " + object2.b);
	}
}
