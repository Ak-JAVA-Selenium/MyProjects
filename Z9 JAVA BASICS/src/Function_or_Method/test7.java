package Function_or_Method;
                         // Method Overloading...........
public class test7 {
	
	void display() {
		int age=20,salary=20000;
		char grade='A';
		System.out.println("age ="+age+"\nsalary ="+salary+"\ngrade ="+grade);
	}
	void display(int age,int salary,char grade) {
		System.out.println("age ="+age+"\nsalary ="+salary+"\ngrade ="+grade);
	}
	void display(int age,char grade,int salary) {
		System.out.println("age ="+age+"\ngrade ="+grade+"\nsalary ="+salary);
	}
	public static void main(String[] args) {
		
		test7 a = new test7();
		a.display();
		System.out.println("====================");
		
		a.display(30, 30000, 'B');
		System.out.println("====================");
		
		a.display(30, 'B', 30000);
	}
}
/*
 * Method Overloading: when a method declared more than once in class with different set of argument like:
 * 1. type of argument differ //or
 * 2. number of argument differ  //or
 * 3. position of argument differ
 */