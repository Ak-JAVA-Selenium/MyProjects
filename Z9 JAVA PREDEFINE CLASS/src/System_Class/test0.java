package System_Class;

final class SamplePrint {

	static String str = "JavaBasic";
}

public class test0 {

	public static void main(String[] args) {

		// final_class.static_ref_variable.public_method
		System.out.println("Hello");
		
		// final_class.static_ref_variable.public_method
		int s=SamplePrint.str.length();
		
		System.out.println(s);
	}
}
