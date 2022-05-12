package A1;

public class ArmstrgNum_3digit_WhileL {

	public static void num(int x) {

		System.out.println("Number : " + x);

		int i = x, rem, res, sum = 0;
		while (i != 0) {
			rem = i % 10;
			res = rem * rem * rem;
			sum = sum + res;
			i = i / 10;
		}
		System.out.println("Sum of cubes of its digits = " + sum);

		if (x == sum) {
			System.out.println("This is Armstsrong Number = " + x);
		} else {
			System.out.println("This is not Armstsrong Number = " + x);
		}
	}

	public static void main(String[] args) {

		ArmstrgNum_3digit_WhileL.num(154);
		System.out.println("==============================");
		ArmstrgNum_3digit_WhileL.num(370);
		System.out.println("==============================");
		ArmstrgNum_3digit_WhileL.num(407);
	}
}
