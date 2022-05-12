package A3;

public class CopyArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 17, 36, 47, 99, 102, 45, 44, 56, 78, 9, 13, 25 };

		System.out.println("All Even Numbers of array : ");
		for (int i : arr) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("\nAll Odd Numbers of array : ");
		for (int i : arr) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
	}
}
