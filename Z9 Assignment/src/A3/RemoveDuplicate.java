package A3;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] arr = new int[] { 17, 36, 17, 99, 102, 45, 44, 36, 78, 99, 13, 45 };
		System.out.print("Before removing duplicate element,\nArray : [ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("]\n");
		int ct = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i] != 0) {
					arr[j] = 0;
					ct++;
				}
			}
		}
		int[] arr1 = new int[arr.length - ct];
		int cy = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[cy] = arr[i];
				cy++;
			}
		}
		System.out.print("After removing duplicate element,\nArray : [ ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
}
