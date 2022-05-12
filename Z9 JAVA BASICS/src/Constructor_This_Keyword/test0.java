package Constructor_This_Keyword;

public class test0 {

	final int x;

	// Constructor with a parameter
	test0(int x) {
		this.x = x;    // this keyword
	}

	// Call the constructor
	public static void main(String[] args) {
		
		test0 Obj = new test0(45);
		System.out.println("Value of x = " + Obj.x);//
	}
}
/**
* this keyword:
*  - Its an instance of current class
*  - its use to differentiate non-static global and local variable when they have same name
*  - can be use to call non-static members of the class
*/