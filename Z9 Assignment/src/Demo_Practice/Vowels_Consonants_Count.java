package Demo_Practice;

public class Vowels_Consonants_Count {

	public static void main(String[] args) {

		System.out.println("Vowels count - " + Vowels_Consonants_Count.checkVowelsCt('a', 'z'));

		System.out.println("Consonants count - " + Vowels_Consonants_Count.checkConsCt('a', 'z'));
	}

	public static int checkVowelsCt(char start, char ends) {
		int ct = 0;
		for (char c1 = start; c1 <= ends; c1++) {
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
				ct = ct + 1;
			}
		}
		return ct;
	}

	public static int checkConsCt(char start, char ends) {
		int ct = 0;
		for (char c1 = start; c1 <= ends; c1++) {
			if (!(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')) {
				++ct;
			}
		}
		return ct;
	}
}
