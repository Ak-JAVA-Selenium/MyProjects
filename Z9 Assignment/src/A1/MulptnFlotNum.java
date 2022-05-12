package A1;

public class MulptnFlotNum {

	public double multptn(float a, float b) {
		double res = a * b;
		return res;
	}

	public static void main(String[] args) {

		MulptnFlotNum ref = new MulptnFlotNum();

		System.out.println("Multiplication Result = " + ref.multptn(0.10f, 7.7f));
	}
}
