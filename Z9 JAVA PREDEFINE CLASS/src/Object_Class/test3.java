package Object_Class;

class Print {
	int a = 10;

	public int hashCode() {
		return 101;
	}

	public String toString() {
		return "I am Print Class toString";
	}

	public boolean equals(Object x) {
		Print p = new Print();//(Print) obj;
		return (this.a == p.a);
		// 10 == 10
	}
}

public class test3 {
	static int last_roll = 100;
	int roll_no;

	test3() {
		roll_no = last_roll;
		last_roll++;
	}

	public static void main(String args[]) {
		
		test3 s = new test3();
		System.out.println("s: toString of ObjectClass4: " + s);// Day32String.ObjectClass4@jhuy98798
		System.out.println("s: hashCode of ObjectClass4: " + s.hashCode());// 68768757

		test3 s1 = new test3();
		System.out.println("s1: toString of ObjectClass4: " + s1);// Day32String.ObjectClass4@jhuy98798
		System.out.println("s1: hashCode of ObjectClass4: " + s1.hashCode());// 68768757
		System.out.println(s.equals(s1));// false

		Print p1 = new Print();
		System.out.println("toString of Print: " + p1);// I am Print Class toString
		System.out.println("hashCode of Print: " + p1.hashCode());// 101
		
		Print p2 = new Print();
		System.out.println(p1.equals(p2));

	}
}
