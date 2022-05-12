package Constructor_This_Keyword;

public class test5 {

	public static void main(String args[]) {

		Student1 s1 = new Student1();
		s1.display();
		System.out.println("======================");
		Student1 s2 = new Student1(101, 5000f);
		s2.display();
		System.out.println("======================");
		Student1 s3 = new Student1(102, 6000f);
		s3.display();
	}
}
class Student1 {

	// Global Variable
	int rollno;
	float fee;

	Student1(int rollno, float fee) {
		System.out.println("local rollno : " + rollno);
		System.out.println("local fee : " + fee);
		System.out.println("intial global rollno : " + this.rollno);
		System.out.println("intialglobal fee : " + this.fee);
		// Global Var = Local Var;
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("after update, global rollno : " + this.rollno);
		System.out.println("after update, intialglobal fee : " + this.fee);
	}
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println(rollno + "<--Default Value-->" + fee);
	}
}
