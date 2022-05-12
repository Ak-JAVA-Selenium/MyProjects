package All_Topic_Practice;

public class String_Class_Fuctions {

	public static void main(String[] args) {
		
		String p="Learn Share Learn Share";

		int x=p. lastIndexOf("a",p.lastIndexOf("a",p.lastIndexOf("a")-1)-1);
		System. out. println(x);

		String s1 = "I am from UP";
		System.out.println("Actual String: " + s1);
		String[] strAry = s1.split(" ");
		for (String s : strAry) {
			System.out.println(s + " ");
		}
		System.out.println();
		System.out.println("***************************");

		String s2 = "I am from Pune";
		System.out.println("Actual String: " + s2);
		String str[] = s2.split(" ");
		String temp = "";
		for (String s : str) {
			System.out.println(s);
		}
		for (int i = str.length - 1; i >= 0; i--) {
			temp = temp + " " + str[i];
		}
		System.out.println("reverse statement: " + temp);
		System.out.println("***************************");

		String s3 = "     I am akshay         ";
		System.out.println("Actual String with spaces: " + s3);
		System.out.println("Actual String length: " + s3.length());
		System.out.println("Actual String without spaces: " + s3.trim());
		System.out.println("Actual String length without spaces: " + s3.trim().length());
		System.out.println("***************************");

		String s4 = "CoreJavaBasics";
		
		// Returns the character at 'i'th index.
		System.out.println("Character at 3rd position = " + s4.charAt(2));
		
		// Return the substring from the 'i'th index character to end of string
		System.out.println("Substring from index 3:" + s4.substring(3));// eJavaBasics
		
		// Returns the substring from i to j-1 index.
		System.out.println("Substring from 2 to 5: " + s4.substring(2, 5));// reJ
		System.out.println("***************************");
		
		String s5 = "Core";
		String s6 = "JavaBasic";
		System.out.println("Concatenated string  = " + s5.concat(s6));// concat strings only
		String s7 = s5 + s6;// concat anything

		// Returns the index within the string of the first occurrence of the specified string.
		String s8 = "Learn Share Learn Share";
		System.out.println("s5 size: " + s8.length());
		System.out.println("Index of 'Share' starts from: " + s8.indexOf("Share"));
		// Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
		System.out.println("Index of a  = " + s8.indexOf('a', 3));

		System.out.println("last Index of 'Learn'  = " + s8.lastIndexOf("Learn"));
		System.out.println("last Index of e = " + s8.lastIndexOf("e", 11));

		// Converting cases
		String word1 = "CoreJava";
		System.out.println("Changing to lower Case " + word1.toLowerCase());// corejava

		// Converting cases
		String word2 = "CoreJava";
		System.out.println("Changing to UPPER Case " + word2.toUpperCase());// COREJAVA

		// Trimming the word
		String word3 = " Learn Share Learn ";
		System.out.println("Trim the word:" + word3.trim());// Remove void spaces-->'Learn Share Learn'

		// Replacing characters
		String str1 = "CoreJavaBasicJava";
		System.out.println("Original String: " + str1);// CoreJavaBasic
		
		String str2 = str1.replace('a', 'x');
		System.out.println("Replaced a with x -> " + str2);// CoreJxvxBasic

		String str3 = str1.replace("Java", "Net");
		System.out.println("Replaced 'Java' with 'Net' -> " + str3);// CoreNetBasic

		String str4 = str1.replaceFirst("a", "W");
		System.out.println("Replaced first 'a' with 'W' -> " + str4);// CoreJWvaBasic
		
		String str5 = " ";
		System.out.println("str5 is empty or not: " + str5.isEmpty());

		String str6 = new String();
		System.out.println("str6 is empty or not: " + str6.isEmpty());
	}
}
