package Switch_Statements;

public class test1 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 5, res;
		char op = '%';

		switch (op) {

		case '-':
			res = num1 - num2;
			System.out.println("num1-num2=" + res);
			break;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2=" + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2=" + res);
			break;
		default:
			System.out.println("Unknown operation");
			break;
		}
		System.out.println("ends here...");
		
		// using method...
		test1.calculator('-', 100, 50);
	}

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
}
