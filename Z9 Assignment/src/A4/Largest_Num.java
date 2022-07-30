package A4;

public class Largest_Num {

	public static void main(String[] args) {

		int[] arr = new int[] { 0, 2, 3, 4, -55, 6, 7, 8, 9, 99 };

		int temp = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (temp < arr[i]) {
				temp = arr[i];
			}
		}
		System.out.println(temp);
	}
}