package Object_Class;

class Demo {
	void display() {
		System.out.println("I am display()..");
	}
}

public class test extends Demo {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	test() {
		roll_no = last_roll;
		last_roll++;
	}

	// Driver code
	public static void main(String[] args) {

		test s = new test();

		// Below two statements are equivalent
		System.out.println(s); // s.toString() -->string representation of an object
		System.out.println(s.toString()); // string representation of an object

		Demo d1 = new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());

		Demo d2 = new test();
		System.out.println(d2);
		System.out.println(d2.toString());
		
		Demo d3 = new test();
		System.out.println(d2);
		System.out.println(d3.toString());
		System.out.println(d2.equals(d3));
		System.out.println(d2==d3);
		
	}
}
