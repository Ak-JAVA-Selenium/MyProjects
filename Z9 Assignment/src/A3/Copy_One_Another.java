package A3;

public class Copy_One_Another {

	public static void main(String[] args) {

		int[] arry = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("Array 1 : ");
		for (int i : arry) {
			System.out.print(i + " ");
		}
		System.out.println();
		int arr[] = new int[arry.length];
		for (int i = 0; i < arry.length; i++) {
			arr[i] = arry[i];
		}
		System.out.print("Array 2 : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
