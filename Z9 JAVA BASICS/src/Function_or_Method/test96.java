package Function_or_Method;					// Total Recall....
public class test96 {
	
	int age = 25;
	static int salary = 25000;
	final int age1 = 30;
	final static int salary1 = 30000;
	
	public static void main(String[] args) {
		
		test96 a = new test96();
		int age = 35;
		final int salary = 35000;
		
		System.out.println(" LV ="+age);
		System.out.println("\n FLV ="+salary);
		System.out.println("\n NSGV ="+a.age);
		System.out.println("\n SGV ="+test96.salary);
		System.out.println("\n FNSGV ="+a.age1);
		System.out.println("\n FSGV ="+test96.salary1);
		
		add(10, 20);
		test96.add(10, 30);
		
		a.add(10, 10.10);
		a.add(10, 10.10, 10);
		a.add(10, 10, 10.90);
	}
	public static double add(int a, int b) {
		double res = a + b;
		System.out.println("\n addition1 ="+res);
		return res;
	}
	public double add(int a, double b) {
		double res = a + b;
		System.out.println("\n addition2 ="+res);
		return res;
	}
	public double add(int a, double b, int c) {
		double res = a + b + c;
		System.out.println("\n addition3 ="+res);
		return res;
	}
	public void add(int a, int c, double b) {
		double res = a + b + c;
		System.out.println("\n addition4 ="+res);
	}
}
