package Constructor_This_Keyword;

public class test2 {

	void m() {
		System.out.println("this keyword pointing to:\n" + this);
								// prints same reference ID
	}

	public static void main(String args[]) {
		
		test2 obj = new test2();

		System.out.println("obj pointing to:\n" + obj);
							// prints the reference ID
		obj.m();
	}
}
