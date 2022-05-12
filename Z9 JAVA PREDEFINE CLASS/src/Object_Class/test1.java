package Object_Class;

public class test1 {
	
	static int last_roll = 100;
	int roll_no;

	// Constructor
	test1() {
		roll_no = last_roll;// 100
		last_roll++;// 101
	}

	@Override
	public int hashCode() {
		return roll_no;
	}

	// Driver code
	public static void main(String args[]) {
		test1 s = new test1();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
	}

}
