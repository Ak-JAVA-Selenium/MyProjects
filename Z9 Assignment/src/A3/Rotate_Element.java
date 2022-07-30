package A3;

public class Rotate_Element {

	static int[] rotateArrayFromIndex(int[] array, int index) {

		System.out.println("Before Rotate, Array : ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		int arr[] = new int[array.length];
		int ct = 0;
		for (int i = index; i < array.length; i++) {
			arr[ct] = array[i];
			ct++;
		}
		if (arr[index] != arr[0]) {
			for (int i = 0; i < index; i++) {
				arr[ct] = array[i];
				ct++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int ary[] = { 1, 2, -100, 4, 0, 6, 7, 8, -9, 0 };

		int ary1[] = Rotate_Element.rotateArrayFromIndex(ary, 3);
		for (int i : ary1) {
			System.out.println(i);
		}
	}
}
