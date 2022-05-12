package A1;

public class ArmstrongNumWhileL {

	public static void armstgnum(int a) {

		System.out.println("Number : " + a);
		int x = a, y = a, z = a, j = a;
		int count = 0, m = 0, k = 0, res = 0;
		while (x != 0) {
			x = x / 10;
			count++;
		}
		while (y != 0) {
			y = y / 10;
			m = z % 10;
			z = z / 10;
			int i = 1;
			while (i < count) {
				res = j % 10;
				m = m * res;
				i++;
			}
			j = j / 10;
			k = k + m;
		}
		if (a == k) {
			System.out.println("This is Armstsrong Number = " + a + "\n");
		} else {
			System.out.println("This is not Armstsrong Number = " + a + "\n");
		}
	}

	public static void main(String[] args) {

		ArmstrongNumWhileL.armstgnum(154);
		ArmstrongNumWhileL.armstgnum(912985153);
		ArmstrongNumWhileL.armstgnum(9926315);
	}
}
