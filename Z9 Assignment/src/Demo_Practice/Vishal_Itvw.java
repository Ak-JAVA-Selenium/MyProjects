package Demo_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Vishal_Itvw {

	public static void main(String[] args) {

		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter Size ");
		int size=src.nextInt();
		
		int [] arr= new int [size];
		
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter Value ");
			arr[i] = src.nextInt();
		}
}}
