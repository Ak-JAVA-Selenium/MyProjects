package A4;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {

		char[] arr1 = new char[10];

		arr1[0] = 'h';
		arr1[1] = 'a';
		arr1[2] = 'k';
		arr1[3] = 's';
		arr1[4] = 'h';
		arr1[5] = 'a';
		arr1[6] = 'y';
		arr1[7] = 'a';
		arr1[8] = 'k';
		arr1[9] = 's';

//		for (char c : arr1) {
//			System.out.println(c);
//		}

		char[] arr2 = new char[10];
		arr2 = arr1.clone();

		for (int i = 0; i < arr2.length; i++) {
			int ct = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					ct++;
					arr2[j] = 0;
				}
			}
			if (ct != 0) {
				System.out.println("Frequency of char : " + arr1[i] + " = " + ct);
			}
		}
	}
}
