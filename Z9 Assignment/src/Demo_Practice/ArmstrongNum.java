package Demo_Practice;

public class ArmstrongNum {

	public static void main(String[] args) {

		int x = 146511208;
		int y = x , z = x;
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
		System.out.println(k);
		
		if (z==k) {
			System.out.println("This is Armstrong Number = "+k);
		}else {
			System.out.println("This is not Armstrong Number = "+z);
		}
	}
}
