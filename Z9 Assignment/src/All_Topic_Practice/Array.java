package All_Topic_Practice;

import java.util.Arrays;

/**
 * datatype[] arrayName; 
 * arrayName = new datatype[size]; 
 * //or 
 * datatype[] arrayName = new datatype[size]; 
 * //or 
 * datatype[] arrayName={, , , , }
 */
class array1 {

	void min(int[] num) {
		int min = num[0];
		for (int i = 1; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("Min Number in this 'Arr2' array : " + min);
	}

	void max(int[] num) {
		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("Max Number in this 'Arr2' array : " + max);
	}
	void getArray(int x,int y) {

		int index = (y-x)+1;
		int a=0;
		int num[]=new int[index];
		System.out.print("[");
		for (int i=x;i<=y;i++) {
			num[a]=i;
			a++;
			System.out.print(" "+i);
			if (i==y) {
				break;
			}
			System.out.print(',');
		}
		System.out.println(" ]");
		
	}
}

public class Array {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// length is the property of array
		System.out.println("array elements count: " + arr.length); // arr.length===count of total numbers
		System.out.println("index 4 element or 3 element: " + arr[4] + " " + arr[3]);
		System.out.println("Printing all the elements of the array....");
		System.out.println("**************for-each loop*******************");
		// iterate array elements using for-each loop
		for (int i : arr) {
			System.out.println("Array : " + i);
		}
		System.out.println("*********Normal for-loop***********");
		// iterate array elements using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array : " + arr[i]);
		}

		System.out.println("==========Copy array==========");
		int arr1[] = Arrays.copyOf(arr, 6);// Arrays.copyOf(ArrayName, Size);=== copy one array to another array
		for (int i : arr1) {
			System.out.println("Array : " + i);
		}
		System.out.println("==========CopyRange array==========");
		int arr3[] = Arrays.copyOfRange(arr1, 2, 7);// Arrays.copyOf(ArrayName, Size);=== copy one array to another array
		for (int i : arr3) {
			System.out.println("Array : " + i);
		}
		System.out.println("====================");
		int arr2[] = new int[] { 51, 61, 21, 91, 31, 81 };
		for (int i : arr2) {
			System.out.println(i);
		}
		array1 a1 = new array1();
		a1.min(arr2);
		a1.max(arr2);
		a1.getArray(50, 60);
		
		System.out.println("========After Sorting============");
		Arrays.sort(arr2);
		for (int i : arr2) {
			System.out.println(i);
		}
		System.out.println("*********Hetrogeneous Array***********");
		Object arry[]=new Object[5];
		Object arry1[]= {'a',01,99.99,"aghgshgjs",arr};  
		for (Object object : arry1) {
			System.out.println(object);
		}
	}
}
