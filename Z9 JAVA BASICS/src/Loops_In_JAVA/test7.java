package Loops_In_JAVA;
							//Assignment...

public class test7 {

	public static int Prime(int i) {
		int num = i, counter = 0;
		while (num >= 1) {
			if (i % num == 0) {
				++counter;
			}
			num--;
		}
		if (counter == 2) {
			System.out.println("This is Prime Number: " + i);
		} else {
			System.out.println("This is not Prime Number: " + i);
		}
		return i;
	}

	public static void main(String[] args) {

		test7.Prime(17);

	}
}
