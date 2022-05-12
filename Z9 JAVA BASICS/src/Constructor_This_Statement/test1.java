package Constructor_This_Statement;

public class test1 {

	test1() {
		this('c', 25.36);
		System.out.println("******Zero-Param*********");
	}

	test1(int age) {
		System.out.println("******int-Param*********");
	}

	test1(char c, double d) {
		this(25);
		System.out.println("******char-double-param*********");
	}

	public static void main(String[] args) {

		test1 t1 = new test1();
	}
}
