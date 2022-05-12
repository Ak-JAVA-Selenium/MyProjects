package Array_MultiDimensional;

public class test1 {

	public static void main(String[] args) {

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
	}
}