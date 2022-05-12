package Object_Class;

public class test0 extends Demo {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	test0() {
		roll_no = last_roll;
		last_roll++;
	}

	// Driver code
	public static void main(String[] args) {

		test0 s = new test0();
		
		// Below two statements are equivalent
		System.out.println(s);// s.toString() -->string representation of an object
		System.out.println(s.toString());// string representation of an object
		System.out.println(s.hashCode());// representation of an Hexadecimal code
		
		Demo d1 = new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());//
	}
}
