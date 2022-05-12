package Object_Class;

public class test2 {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	test2() {
		roll_no = last_roll;
		last_roll++;
	}

	@Override
	public String toString() {
		return "BasicCoreJava";
	}

	// Driver code
	public static void main(String args[]) {
		test2 s = new test2();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
	}
}
