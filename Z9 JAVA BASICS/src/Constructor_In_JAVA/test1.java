package Constructor_In_JAVA;

public class test1 {

	int roll;
	double salary;

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String args[]) {

		test1 c1 = new test1();
		c1.display();
	}
}
