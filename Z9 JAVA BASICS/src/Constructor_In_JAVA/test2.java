package Constructor_In_JAVA;

public class test2 {

	int roll;
	double salary;

	test2(int r, double s) {
		roll = r;
		salary = s;
	}

	void display() {
		System.out.println(roll + " " + salary);
	}

	public static void main(String args[]) {
		
		test2 c1 = new test2(101, 250045.45);
		c1.display();
		
		test2 c2 = new test2(201, 550045.45);
		c2.display();
	}
}
