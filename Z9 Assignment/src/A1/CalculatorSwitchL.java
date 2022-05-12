package A1;

public class CalculatorSwitchL {

	static double cal(char oprtn, int num1, int num2) {

		int res = 0;
		switch (oprtn) {
		case '-':
			res = num1 - num2;
			System.out.println("num1-num2 = " + res);
			break;
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2 = " + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2 = " + res);
			break;
		case '*':
			res = num1 * num2;
			System.out.println("num1*num2 = " + res);
			break;
		case '%':
			res = num1 % num2;
			System.out.println("num1%num2 = " + res);
			break;
		default:
			System.out.println("Unknown operation");
			break;
		}
		return res;
	}

	public static void main(String[] args) {

		CalculatorSwitchL.cal('-', 100, 50);
	}
}
