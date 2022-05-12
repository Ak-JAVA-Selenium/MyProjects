package Switch_Statements;

public class test2 {

	public static void main(String[] args) {

		char ch = 'a';
		switch (ch) {
		case 'e':
			System.out.println("Value matched - e, "+ch+" is vowel");
			break;
		case 'a':
			System.out.println("Value matched - a, "+ch+" is vowel");
			break;
		case 'u':
			System.out.println("Value matched - u, "+ch+" is vowel");
			break;
		case 'o':
			System.out.println("Value matched - o, "+ch+" is vowel");
			break;
		case 'i':
			System.out.println("Value matched - i, "+ch+" is vowel");
			break;
		default:
			System.out.println("Given character is not a vowel");
			break;
		}
	}
}
