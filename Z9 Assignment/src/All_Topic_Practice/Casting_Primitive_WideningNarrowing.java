package All_Topic_Practice;
/** Type casting... **/
class Casting {

	double test1(int d) { // Implicit/Auto widening
		System.out.println("test1");
		System.out.println("d value =" + d);
		return d;
	}

	int test2(double k) { // Explicit Narrowing
		System.out.println("test2");
		System.out.println("k value =" + k);
		return (int) k;
	}

	double test3(int d) { // Implicit/Auto widening
		return d;
	}

	int test4(double k) { // Explicit Narrowing
		return (int) k;
	}
}

public class Casting_Primitive_WideningNarrowing {

	public static void main(String[] args) {

		/** Implicit/Explicit Widening or Auto/Manual Widening */
		int myInt = 9;
		System.out.println(myInt);

		double myDouble = myInt; /** implicit widening */
		System.out.println(myDouble);

		double d = (double) myInt; /** explicit widening */
		System.out.println(d);

		/** Explicit Narrowing --> implicit narrowing not possible */
		double salary = 23400.67856856898989545d;
		System.out.println("Actual Salary: " + salary);

		int sal = (int) salary; /** Narrowing double--->int, explicit */
		System.out.println("Int Salary: " + sal);

		long f = (long) salary; /** Narrowing double--->long, explicit */
		System.out.println("long Salary: " + f + "\n");

		Casting ref = new Casting();

		ref.test1(7);
		ref.test2(77.77);

		System.out.println("test3");
		System.out.println(ref.test3(7));
		System.out.println("test4");
		System.out.println(ref.test4(77.77));
	}

}
