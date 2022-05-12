package Array_MultiDimensional;

public class test {

	public static void main(String[] args) {
		// declaring and initializing 2D array

		int[][] arr = new int[5][4];

		System.out.println("Array Size: " + arr.length + "\n");

		for (int i = 0; i < arr.length; i++) {// row count
			for (int j = 0; j < arr[i].length; j++) {// cell count on current row
				System.out.print("   " + arr[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("*****************************\n");
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		// printing 2D array
		for (int i = 0; i < arr.length; i++) {// to get row num

			for (int j = 0; j < arr[i].length; j++) {// to get column for above row
				System.out.print("   " + arr[i][j]);
			}
			System.out.println("\n");
		}
	}
}
