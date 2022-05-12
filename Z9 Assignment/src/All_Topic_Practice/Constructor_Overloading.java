package All_Topic_Practice;
/**
 * Constructor Overloading: more than one constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 */
public class Constructor_Overloading {
	static int age;
	double salary;

	Constructor_Overloading() {
		System.out.println("============Zero- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		System.out.println("============Zero- Parameterized Constructor Ends....============");
	}

	Constructor_Overloading(int a) {
		System.out.println("============int Parameterized Constructor started============");
		System.out.println(" having int parameters");
		age = a;
		System.out.println("============int Parameterized Constructor Ends....============");
	}

	Constructor_Overloading(double b) {
		System.out.println("============double Parameterized Constructor============");
		System.out.println(" having double parameters");
		salary = b;
		System.out.println("============double- Parameterized Constructor Ends....============");
	}

	Constructor_Overloading(int a, double b) {
		System.out.println("============int-double Parameterized Constructor started============");
		System.out.println(" having int-double parameters");
		age = a;
		salary = b;
		System.out.println("============int-double Parameterized Constructor Ends....============");
	}

	public static void main(String args[]) {

		Constructor_Overloading pc1 = new Constructor_Overloading();
		System.out.println("After Zero-para constructor,Age= " + pc1.age);
		System.out.println("After Zero-para constructor,Salary= " + pc1.salary);

		Constructor_Overloading pc2 = new Constructor_Overloading(33);
		System.out.println("After int-para constructor,Age= " + pc2.age);
		System.out.println("After int-para constructor,Salary= " + pc2.salary);

		Constructor_Overloading pc3 = new Constructor_Overloading(34000.34);
		System.out.println("After double-para constructor,Age= " + pc3.age);
		System.out.println("After double-para constructor,Salary= " + pc3.salary);

		Constructor_Overloading pc4 = new Constructor_Overloading(30, 95000.34);
		System.out.println("After int-double-para constructor,Age= " + pc4.age);
		System.out.println("After int-double-para constructor,Salary= " + pc4.salary);
	}
}
