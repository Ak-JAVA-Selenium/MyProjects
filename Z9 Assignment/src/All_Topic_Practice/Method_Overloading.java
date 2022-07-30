package All_Topic_Practice;
											//Method Overloading...........
public class Method_Overloading {
	/**
	 * Method Overloading: when a method declared more than once in class withdifferent set of argument like: 
	 * 1. type of argument differ //or 
	 * 2. number of argument differ //or 
	 * 3. position of argument differ
	 */
	public static int add(int a, int b) {
		int res = a + b;
		System.out.println("\n addition1 =" + res);
		return res;
	}

	public double add(int a, double b) {
		double res = a + b;
		System.out.println("\n addition2 =" + res);
		return res;
	}

	public double add(int a, double b, int c) {
		double res = a + b + c;
		System.out.println("\n addition3 =" + res);
		return res;
	}

	public void add(int a, int c, double b) {
		double res = a + b + c;
		System.out.println("\n addition4 =" + res);
	}

	public static void main(String[] args) {

		Method_Overloading a = new Method_Overloading();
		
		add(10, 20);
		Method_Overloading.add(10, 30);

		a.add(11, 11.11);
		
		a.add(33, 33.33, 33);
		
		a.add(44, 44, 44.44);
	}
}
