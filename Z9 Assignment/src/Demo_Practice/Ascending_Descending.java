package Demo_Practice;

public class Ascending_Descending {

	public static void main(String[] args) {

		int arr[] = { 79, 46, 28, 55, 40, 88, 109, 805, 909, 1000 };

		System.out.print("Before sorting, Array : [ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]\n");

		int arr1[] = new int[arr.length];
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
				}

			}
			arr1[i] = arr[i];
		}
		System.out.print("After sorting, Array : [ ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
}
