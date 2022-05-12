package A2;

import java.util.Scanner;

public class Calculator_Scanner {

	static double cal() {

		Scanner ref = new Scanner(System.in);
		System.out.print("Enter value Num1 = ");
		int num1 = ref.nextInt();
		System.out.print("Enter value Num2 = ");
		int num2 = ref.nextInt();
		System.out.print("Operation = ");
		char optn = ref.next().charAt(0);
		int res = 0;
		System.out.println();
		switch (optn) {
		case '-':
			res = num1 - num2;
			System.out.println("Num1 - Num2 = " + res);
			break;
		case '+':
			res = num1 + num2;
			System.out.println("Num1 + Num2 = " + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("Num1 / Num2 = " + res);
			break;
		case '*':
			res = num1 * num2;
			System.out.println("Num1 * Num2 = " + res);
			break;
		case '%':
			res = num1 % num2;
			System.out.println("Num1 % Num2 = " + res);
			break;
		default:
			System.out.println("Unknown Operation");
			break;
		}
		return res;
	}

	public static void main(String[] args) {

		Calculator_Scanner.cal();
	}
}
