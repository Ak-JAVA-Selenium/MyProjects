package Function_or_Method;				
						// StaticMethod..method overloading
public class test9 {

	public static void main() {
		System.out.println("I am main()...");
	}
	public static void main(String[] args) {
		main();
		test9.main();
		System.out.println("sum:1 "+addNumbers());
		System.out.println("sum:2 "+addNumbers(45, 55));
		System.out.println("sum:3 "+addNumbers(47, 53, 58));
		System.out.println("sum:4 "+addNumbers(47, 53.56, 58));
	}
	static int addNumbers() {
		System.out.println("********* addNumbers() started *********");
		System.out.println("********* addNumbers() before return *********");
		int num1=10,num2=20;
		return num1+num2;		
	}
	static int addNumbers(int num1,int num2) {
		System.out.println("********* addNumbers() started *********");		
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
	static int addNumbers(int num1,int num2,int num3) {
		System.out.println("********* addNumbers() started *********");		
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
	static double addNumbers(int num1,double num2,int num3) {
		System.out.println("********* addNumbers() started *********");		
		System.out.println("********* addNumbers() before return *********");
		return num1+num2;		
	}
}
