package A1;

public class VowelsConsonants {

	public static void test(char x) {

		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O'
				|| x == 'U') {
			System.out.println("Given Char is Vowel = " + x);
		} else {
			System.out.println("Given Char is Consonant = " + x);
		}
	}

	public static void main(String[] args) {

		VowelsConsonants.test('D');

		VowelsConsonants.test('i');

		VowelsConsonants.test('I');
	}
}
