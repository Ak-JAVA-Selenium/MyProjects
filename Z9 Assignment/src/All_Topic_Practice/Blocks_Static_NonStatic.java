package All_Topic_Practice;
							/*		{  body or definition or block }		*/
public class Blocks_Static_NonStatic {

	static int age;
	double salary;

	static {
		// static block or SIB (static initialization block)
		// If we need to provide any information before main() then we use this block
		age = 30;
	}

	{
		// non-static block or NSIB (non-static initialization block) or instance block
		// If we want to provide any information before object creation then we use this
		salary = 45000;
	}
	static {
		System.out.println("running static-block-1 of class..");
	}
	{
		System.out.println("running non-static-block-1 of class..");
	}

	public static void main(String[] args) {

		System.out.println("Main methode start..");
		System.out.println("Creating object..");
		Blocks_Static_NonStatic a = new Blocks_Static_NonStatic();
		System.out.println("age : "+Blocks_Static_NonStatic.age);
		System.out.println("salary : "+a.salary);
		System.out.println("Main methode end..");
	}

	static {
		System.out.println("running static-block-2 of class..");
	}
	{
		System.out.println("running non-static-block-2 of class..");
	}
}
