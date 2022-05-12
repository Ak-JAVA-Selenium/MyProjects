package Constructor_In_JAVA;

public class test0 {

	int age;
	double salary;
	
	/*
	 * below is default constructor, that will be written by java compiler at
	 * compile time........test0() {      //empty body         }
	 */

	public static void main(String[] args) {

		test0 c1 = new test0();
		System.out.println(c1.age);// 0
		System.out.println(c1.salary);// 0.0
	}
}
