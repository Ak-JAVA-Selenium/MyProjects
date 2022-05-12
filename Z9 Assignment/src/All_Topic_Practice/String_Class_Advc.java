package All_Topic_Practice;

public class String_Class_Advc {

	static String reverseString(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

	static void palinString(String str) {
		// AbleWasIereIsaWelbA
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
	public static void main(String[] args) {

		String str1 = "DhanoriPune";
		// to print one by one character of string
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i)+"  ");
		}
		System.out.println();
		
		System.out.println("str1 : " + str1);	
		System.out.println("using for loop, str1-->reverse : " +reverseString(str1));
		palinString("AbleWasIereIsaWelbA");
		
		String str = "Pune" + 1536;
		System.out.println(str);
		String str2 = str.concat(null);// Null Pointer Exception
		System.out.println(str2);
	}
}
