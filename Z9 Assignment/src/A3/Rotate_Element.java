package A3;

public class Rotate_Element {

	static int[] rotate(int[] ary, int y) {

		System.out.println("Before Rotate, Array : ");
		for (int i : ary) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		int arr[] = new int[ary.length];
		int ct = 0;
		for (int i = y; i < ary.length; i++) {
			arr[ct] = ary[i];
			ct++;
		}
		if (y > 0) {
			for (int i = 0; i < y; i++) {
				arr[ct] = ary[i];
				ct++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int ary[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int ary1[] = Rotate_Element.rotate(ary, 3);
		for (int i : ary1) {
			System.out.println(i);
		}
	}
}
