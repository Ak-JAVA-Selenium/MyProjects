package Demo_Practice;

public class AAAA {

	static {
		System.out.println("character || Frenquency");
		System.out.println("=======================");
	}

	public static void main(String[] args) {
		String s = "dhanraj kakasaheb shinde";
		int frenq[] = new int[s.length()];
		int count = 0;
		char[] arr = s.toCharArray();
		count = 0;
		for (int i = 0; i < s.length(); i++) {
			count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
			if (arr[i] != '0' && arr[i] != ' ') {
				System.out.println(arr[i] + "         ||   " + count);
			}
			/*
			 * if(arr[i]!='0'&&count>1&&arr[i]!=' '){ System. out.
			 * println(arr[i]+" | "+count); }
			 */
		}
		System.out.println(s);
		for (int i = 0; i < frenq.length; i++) {
			if (arr[i] != '0' && arr[i] != ' ') {
				System.out.println(arr[i] + "   |   " + frenq[i]);
			}
		}
	}
}
