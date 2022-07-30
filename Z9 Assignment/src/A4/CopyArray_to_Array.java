package A4;

public class CopyArray_to_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[7];

		arr1[0] = 45;
		arr1[1] = 65;
		arr1[2] = 485;
		arr1[3] = 95;
		arr1[4] = 865;
		arr1[5] = 525;
		arr1[6] = 125;

		for (int i : arr1) {
			System.out.println(i);
		}
		System.out.println();

		int[] arr2 = new int[7];

		arr2 = arr1.clone();

		for (int j : arr2) {
			System.out.println(j);
		}
		System.out.println();

		int[] arr3 = new int[7];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}

		for (int j : arr3) {
			System.out.println(j);
		}
		System.out.println();
		
		String[] arr0 = new String[7];
		for (String i : arr0) {
			System.out.println(i);
		}
	}
}
