package A1;

public class SumNaturalNum {

	public static int sum(int x, int y) {
		
		int count = 0;
		if (x > 0 && y > x) {
			for (int i = x; i <= y; i++) {
				count++;
			}
		}
		int n = count;
		int res = (n * (n + 1)) / 2;
		
		System.out.println("From Num1 = " + x + "\nTo   Num2 = " + y);
		System.out.println("Sum of natural numbers = " + res);
		return res;
	}

	public static void main(String[] args) {

		SumNaturalNum.sum(1, 100);

	}
}
