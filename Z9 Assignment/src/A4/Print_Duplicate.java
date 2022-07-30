package A4;

import java.util.Scanner;

public class Print_Duplicate {

	public static void main(String[] args) { // 1, 2, 3, 4, 2, 7, 8, 8, 3

		Scanner scr = new Scanner(System.in);

		System.out.print("Enter Array Length : ");
		int arrLength = scr.nextInt();

		int[] arr = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter value-Array[" + i + "] : ");
			arr[i] = scr.nextInt();
		}

		int[] temp = new int[arr.length];
		int pre = -1;

		for (int i = 0; i < arr.length; i++) {
			int ct = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == (arr[j])) {
					ct++;
					temp[j] = pre;
				}
			}
			if (temp[i] != pre) {
				temp[i] = ct;
			}
		}

		System.out.println();
		System.out.println("Duplicate Elements : ");
		System.out.println("===================================");
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] > 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
