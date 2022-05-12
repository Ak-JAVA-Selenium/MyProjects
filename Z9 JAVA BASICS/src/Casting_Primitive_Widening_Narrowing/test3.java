package Casting_Primitive_Widening_Narrowing;

class Sample {
	void test1(double d)// double d=7;
	{
		System.out.println("d value=" + d);
	}
//    void test1(int k)
//    {
//        System.out.println("k value="+k);
//    }
}

public class test3 {

	public static void main(String[] args) {

		System.out.println("Program starts");
		Sample s = new Sample();
		s.test1(7);
		System.out.println("Program ends");
	}
}
