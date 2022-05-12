package Constructor_This_Statement;

public class test0 {

	test0() {
		System.out.println("******Zero-Param*********");
	}

	test0(int age) {
		this();
		System.out.println("******int-Param*********");
	}

	test0(char c, double d) {
		this(25);
		System.out.println("******char-double-Param*********");
	}

	public static void main(String[] args) {

//		test0 t1=new test0();
//		test0 t2=new test0(25);
		test0 t3 = new test0('c', 25.36);
	}
}
