package A3;

public class Ascending_Descending {

	public static void main(String[] args) {

		int arr[] = { 79, 46, 28, 55, 40, 88, 109, 805, 909, 1000 };

		System.out.print("Before sorting, Array : [ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");

		int min = 0;

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
				}
			}
		}
		System.out.print("After sorting, Array : [ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");
		
//		int max = 0;
//
//		System.out.println();
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					max = arr[i];
//					arr[i] = arr[j];
//					arr[j] = min;
//				}
//			}
//		}
//		System.out.print("After sorting, Array : [ ");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//		System.out.print("]");
	}
}
