package A4;

import java.util.*;

public class Frequency2 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.print("Enter Array Length : ");
		int arrLength = scr.nextInt();

		boolean[] arr = new boolean[arrLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter value-Array[" + i + "] : ");
			arr[i] = scr.nextBoolean();
		}

		int[] temp = new int[arr.length];
		int pre = -1;

		for (int i = 0; i < arr.length; i++) {
			int ct = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]==(arr[j])) {
					ct++;
					temp[j] = pre;
				}
			}
			if (temp[i] != pre) {
				temp[i] = ct;
			}
		}

		System.out.println("Element = Frequency");
		System.out.println("===================================");
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] != pre) {
				System.out.println(arr[i] +" = " + temp[i]);
			}
		}
	}
}
