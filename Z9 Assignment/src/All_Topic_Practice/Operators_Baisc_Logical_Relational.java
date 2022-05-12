package All_Topic_Practice;

class main {

	public static void BasicArithmeticOperators(int number1, int number2) {

		System.out.println(" Num1 =" + number1 + "\tNum2 =" + number2);

		double res = number1 + number2;
		System.out.println("\n Sum is : " + res);

		res = number1 - number2;
		System.out.println("\n Difference is : " + res);

		res = number1 * number2;
		System.out.println("\n Multiplied value is : " + res);

		res = number1 / number2;
		System.out.println("\n Quotient is : " + res);

		res = number1 % number2;
		System.out.println("\n Remainder is : " + res);
	}

	public static void RelationalOperators(int num1, int num2) {

		System.out.println(" Num1: " + num1 + "\tNum2: " + num2);

		// is equal to
		System.out.println("\n num1 == num2 : " + (num1 == num2));

		// is not equal to
		System.out.println("\n num1 != num2 : " + (num1 != num2));

		// Greater than
		System.out.println("\n num1 >  num2 : " + (num1 > num2));

		// Less than
		System.out.println("\n num1 <  num2 : " + (num1 < num2));

		// Greater than or equal to
		System.out.println("\n num1 >= num2 : " + (num1 >= num2));

		// Less than or equal to
		System.out.println("\n num1 <= num2 : " + (num1 <= num2));
	}

	public static void LogicalOperators() {

		int age = 17;
		char BloodGr = 'c';

		boolean res1, res2;
		res1 = (age > 18);
		res2 = (BloodGr == 'A');

		System.out.println(" Result1: " + res1);
		System.out.println(" Result2: " + res2);

		// Logical AND
		System.out.println("\n bool1 && bool2 = " + (res1 && res2));

		// Logical OR
		System.out.println("\n bool1 || bool2 = " + (res1 || res2));

		// Logical Not
		System.out.println("\n !(bool1 && bool2) = " + !(res1 && res2));

		// Logical AND :
		// true  + true  = true
		// true  + false = false
		// false + false = false

		// Logical OR :
		// true + true = true
		// true + false = true
		// false + false = false

		// Logical Not :
		// true + true = false
		// true + false = true
		// false + false = true
	}
}

public class Operators_Baisc_Logical_Relational {

	public static void main(String[] args) {

		main.BasicArithmeticOperators(100, 200);
		System.out.println("==============================");
		main.LogicalOperators();
		System.out.println("==============================");
		main.RelationalOperators(100, 200);
	}
}
