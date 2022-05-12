package A1;

public class ArmstrongNumForL {

	public static void armstgnum(int a) {

		System.out.println("Number : " + a);
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
			System.out.println("This is Armstsrong Number = " + a + "\n");
		} else {
			System.out.println("This is not Armstsrong Number = " + a + "\n");
		}
	}

	public static void main(String[] args) {

		ArmstrongNumForL.armstgnum(912985153);
		ArmstrongNumForL.armstgnum(9926315);
		ArmstrongNumForL.armstgnum(154);
	}
}
