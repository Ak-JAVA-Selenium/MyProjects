package Demo_Practice;

public class ASCIIvalue {
	
	public static void ASCII() {
		
		int value=0;
		for (char i='A';i<='Z';i++) {
			value = i;
			System.out.println(i+" = "+value);
		}
	}
	public static void ASCII1() {
		
		int value=0;
		for (char i='a';i<='z';i++) {
			value = i;
			System.out.println(i+" = "+value);
		}
	}

	public static void main(String[] args) {

		ASCIIvalue.ASCII();
		System.out.println("==============");
		ASCIIvalue.ASCII1();
	}
}
