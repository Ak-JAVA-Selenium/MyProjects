package Demo_Practice;

public class Final_can_change {

	final static int age1;
	final int age2;

	Final_can_change() {
		this.age2 = 10;
	}

	static {
		System.out.println("hiiiiii");
		age1 = 12;
	}

	public static void main(String[] args) {

		Final_can_change hi = new Final_can_change();
		System.out.println(hi.age2);

		System.out.println(Final_can_change.age1);
	}
}
