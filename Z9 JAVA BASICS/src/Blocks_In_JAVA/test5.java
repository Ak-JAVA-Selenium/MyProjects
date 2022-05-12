package Blocks_In_JAVA;

public class test5 {
	
	static int age;
	double salary;
	
	/* static block or SIB */
	static {
		age = 30;
	}
	
	/* non-static block or IIB */
	{
		salary = 45000.32;
	}

	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + test5.age);
		System.out.println("---------------------------------");
		test5 b1 = new test5();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");
	}
}
