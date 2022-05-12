package Demo_Practice;

public class ArmstrgNumPrint {

	public static void main(String[] args) {

		System.out.println("Armstsrong Numbers :");

		for (int a = 1; a <= 1000000000; a++) {
			int x = a;
			int y = x;
			int count = 0, m = 0, k = 0, res = 0;
			for (; x != 0; x = x/10) {
				count++;
			}
			for (; y != 0; y = y/10) {
				m = y % 10;
				for (int i = 1; i < count; i++) {
					res = y % 10;
					m = m * res;
				}
				k = k + m;
			}
			if (a == k) {
				System.out.println(a);
			}
		}
	}
}
