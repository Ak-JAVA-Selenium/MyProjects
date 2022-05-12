package Constructor_Final_Keyword;

public class test {

	public static void main(String args[]) {

		int age = 20;
		
		System.out.println("age: " + age);
		age = 25;
		System.out.println("1st change in age: " + age);
		age = 30;
		System.out.println("2nd change in age: " + age);
		age = 34;
		System.out.println("3rd change in age: " + age);
		
		final int age1 = 20;
		
		System.out.println("age: " + age1);
//		age1 = 20;  // can't be reinitialize...C T Error
//		System.out.println("age: " + age1);
	}
}
/**
* anything declared with final keyword known as constant
* any variable declared with final keyword should initialize at the same time
*
*/
