package Encapsulation_GetSet_Method;
// Read only.....
class Student2 {
	// private data member
	private String college = "AKG";

	// getter method for college
	public String getCollege() {
		return college;
	}
}

public class test5 {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student2 s = new Student2();
		// getting value of the name member
		System.out.println(s.getCollege());
	}
}
