package Demo_Practice;

import java.util.Arrays;

public class StringsMatch {

	public static void match(String s1, String s2) {

		String s3 = "";
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				char x = s1.charAt(i);
				int ct = 0;
				for (int j = 0; j < s2.length(); j++) {
					char y = s2.charAt(j);
					if (x == y && ct == 0) {
						s3 = s3 + y;
						ct++;
					}
				}
			}
			System.out.println(s3.equals(s1));
		} else {
			System.out.println("False");
		}
	}

	public static void main(String[] args) {

		StringsMatch.match("keepleafbip", "kepepiblfae");

		String s1 = "keepleafbip";
		String s2 = "kepepiblfae";
		String s3 = "kkep";

		char[] arr1 = s1.toCharArray();
		Arrays.sort(arr1);
		System.out.println(arr1);

		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr2);
		System.out.println(arr2);

		System.out.println(Arrays.equals(arr1, arr2));
	}
}
