package All_Topic_Practice;

public class Array_MultiDimensional {

	public static void main(String[] args) {

		int ref[][] = new int[][] { { 10, 20, 30, 40, 50 }, { 50, 40, 30, 20, 10 }, { 0, 0, 0, 0, 0 },
				{ 01, 02, 03, 04, 05, 06 } };
		for (int[] i : ref) {
			for (int j : i) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		System.out.println("============================");
		// declaring a source array
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		System.out.println(copyFrom.length);
		System.out.println("=====================");

		// declaring a destination array
		char[] copyTo = new char[7];

		/** copying array using System.arraycopy() method **/

		System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);// src, indextocopy, dest, indextostart,indextoend

		for (int i = 0; i < copyTo.length; i++) {
			System.out.println(copyTo[i]);
		}
		System.out.println("=====================");
		System.out.println(copyTo.length);
	}
}
