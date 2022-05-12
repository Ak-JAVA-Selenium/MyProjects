package Constructor_This_Keyword;

public class test {

	public static void main(String args[]) {

		Student s1 = new Student(101, 5000f);
		s1.display();
		Student s2 = new Student(102, 6000f);
		s2.display();
	}
}
class Student {

	int rollno;
	float fee;

	Student(int rollno, float fee) { // rollon=101, fee=5000.0
		rollno = rollno;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}
/**
* this keyword:
*  - Its an instance of current class.
*  - its use to differentiate non-static global and local variable when they have same name.
*  - or can be use to call non-static members of the class.
*  - its use in only in non-static method or members to call another non-static member.
*/


