package All_Topic_Practice;

class Another{
	
		int a = 100;

		public int hashCode() {
			return 7007;
		}

		public String toString() {
			return "I am Print Class overrided toString";
		}

		public boolean equals(Object x) {
			Another p = new Another();
			this.a=101;
			return (this.a == p.a);
		}
}
public class Oject_Class {

	static int last_roll = 100;
	int roll_no;

	Oject_Class() {												
		roll_no = last_roll;
		last_roll++;
	}
	public static void main(String[] args) {
		
		Oject_Class s = new Oject_Class();
		System.out.println("s: toString of ObjectClass4: " + s);// s.toString() -->string representation of an object
		System.out.println(s.toString()); // string representation of an object
		System.out.println("s: hashCode of ObjectClass4: " + s.hashCode());// representation of an Hexadecimal code

		Oject_Class s1 = new Oject_Class();
		System.out.println("s1: toString of ObjectClass4: " + s1);
		System.out.println(s.toString());
		System.out.println("s1: hashCode of ObjectClass4: " + s1.hashCode());
		System.out.println(s.equals(s1));// false= address base 

		Another p1 = new Another();
		System.out.println("toString of Print: " + p1);
		System.out.println(p1.toString());
		System.out.println("hashCode of Print: " + p1.hashCode());
		
		Another p2 = new Another();
		System.out.println(p1.equals(p2));
	}
}
