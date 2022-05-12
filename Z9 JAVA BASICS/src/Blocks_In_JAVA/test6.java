package Blocks_In_JAVA;

public class test6 {

	int age = 25;
	double salary = 15000.57;

	void print() {
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
	}

	public static void main(String[] args) {
		System.out.println("main() Starts..");
		test6 b1 = new test6();
		b1.print();//
		b1.salary = 45000.32;
		b1.print();//
		System.out.println("main() ends..");
	}
}
