package All_Topic_Practice;

public class Method_Non_Static {

	public double demo1(double p, double r, double t) {
		return (p * r * t) / 100;
	}

	protected double demo2(double p, double r, double t) {
		double res = (p * r * t) / 100;
		System.out.println("SimpleInt demo2 =" + res);
		return res;
	}

	void demo3(double p, double r, double t) {
		double res = (p * r * t) / 100;
		System.out.println("SimpleInt demo3 =" + res);
	}

	public static void main(String[] args) {

		// Instance/object need to be create for non-static method calling
		Method_Non_Static ref = new Method_Non_Static();
//demo1
		System.out.println("SimpleInt demo1 =" + ref.demo1(100000, 5, 1));
		System.out.println("=====================");
		double ref1 = ref.demo1(100000, 5, 3);
		System.out.println("SimpleInt2 demo1 =" + ref1);
		System.out.println("=====================");
		ref.demo1(100000, 5, 5);// Execute but can't give value.
		System.out.println("=====================");
//demo2		
		ref.demo2(100000, 5, 6);
		System.out.println("=====================");
		System.out.println("SimpleInt2 demo2 =" + ref.demo2(100000, 5, 1));
		System.out.println("=====================");
		double ref2 = ref.demo2(100000, 5, 3);
		System.out.println("SimpleInt3 demo2 =" + ref2);
		System.out.println("=====================");
//demo3		
		ref.demo3(100000, 5, 7);
	}
}
