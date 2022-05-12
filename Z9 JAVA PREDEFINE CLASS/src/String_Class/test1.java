package String_Class;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		String str1 = "DhanoriPune";
		String temp = "";
		// to print one by one character of string
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i)+"  ");
		}
		System.out.println();
		
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp = temp + str1.charAt(i);
		}// output: enuPironahD
		
		System.out.println("str1 : " + str1);
		System.out.println("temp : " + temp);
		System.out.println(reverseString("DhanoriPune"));
		
		String s1="Bangalore";
		System.out.println(reverseString(s1));
		
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("Enter String to be reverse: ");
		s2=scn.next();
		System.out.println("Reverse String is: "+reverseString(s2));

		// System.out.println(palinString("abcd"));
		Scanner scn1=new Scanner(System.in);
		String s3;
		System.out.println("Enter string to check for palindrome");
		s3=scn1.next();
		palinString(s3);

	}

	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

	static void palinString(String str) {
		// AbleWasIereIsawElba
		String s1 = str;
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (s1.equals(temp)) {
			System.out.println("Given string is a palindrome :" + str);
		} else {
			System.out.println("Given string is not a palindrome :" + str);
		}
	}
}
