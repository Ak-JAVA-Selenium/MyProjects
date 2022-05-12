package A1;

public class PositiveNegative {

	static void plusminus(int x) {

		System.out.println("Number = " + x);
		
		if (x > 0) {
			System.out.println("This is Positive Number = " + x);
		} else {
			System.out.println("This is Negative Number = " + x);
		}
	}

	public static void main(String[] args) {

		PositiveNegative.plusminus(-898);
		System.out.println("==================================");
		PositiveNegative.plusminus(273);
	}
}
