package Function_or_Method;
						// method overloading....datatypes
public class test95 {
	
	void disp(int a, char b) {
		System.out.println("Method A");
	}
	void disp(int a, byte b) {
		System.out.println("Method B");
	}
	void disp(int a, long b) {
		System.out.println("Method C");
	}
	void disp(int x, short y) {
		System.out.println("Method D");
	}

	public static void main(String args[]) {
		
		test95 obj = new test95();
		obj.disp(100, 2030507080);
		
		obj.disp(100, 125);
		
		obj.disp(100, 12520);
		
		obj.disp(100, 'A');
	}
}
