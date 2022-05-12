package Constructor_Final_Keyword;

public class test0 {

	final int speedlimit;// blank final variable

	test0() {

		speedlimit = 70;
		System.out.println("FNGV = "+speedlimit);
	}

	public static void main(String args[]) {

		test0 f1 = new test0();
		System.out.println("FNGV = "+f1.speedlimit);
	}
}
