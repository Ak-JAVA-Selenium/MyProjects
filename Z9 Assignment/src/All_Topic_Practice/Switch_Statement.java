package All_Topic_Practice;

public class Switch_Statement {

	static double calculator(char oprtn, int num1, int num2) {

		int res = 0;

		switch (oprtn) {
		case '-':
			res = num1 - num2;
			System.out.println("num1-num2=" + res);
			return res;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2=" + res);
			return res;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2=" + res);
			return res;
		default:
			System.out.println("Unknown operation");
			return res;
		}
	}

	public static void main(String[] args) {

		Switch_Statement.calculator('-', 500, 299);
	}
}
