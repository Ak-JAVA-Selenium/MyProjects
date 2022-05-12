package Demo_Practice;

public class String_Char_Repeat {

	public static void main(String[] args) {

		String str = "TATA IS MNC,TCS IS AUTONOMUS BODY OF TATA";
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			int ct = 0;
			String y = "";
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					ct++;
				}
			}
			y = y + str.charAt(i);
			if (ct > 1 && !s.contains(y)) {
				s = s + str.charAt(i);
				System.out.println(str.charAt(i)+"="+ct);
			}else if (ct == 1 && !s.contains(y)) {
				s = s + str.charAt(i);
				System.out.println(str.charAt(i)+"="+ct);
			}
		}
	}
}
