package All_Topic_Practice;
//Local Variable...& global variable

public class Local_Global_Variable {

	static int age2;
	static int age = 3; // static global variable
	int balls2;
	int balls = 4; // non-static global variable

	public static void main(String[] args) {
		// local variable
		int x;
		x = 1; // or
		int y = 2;
		System.out.println(x + " " + y);

		System.out.println("SGV " + age);// SGV

		int age = 5; // when local & SGV name are same.
		System.out.println("local.." + age); // local
		System.out.println("SGV...." + Local_Global_Variable.age); // SGV
		// ClassName.VariableName

		Local_Global_Variable ref = new Local_Global_Variable(); // create object/instance
		System.out.println("NSGV.." + ref.balls);// NSGV
		// ReferenceVariableName.VariableName

		System.out.println("SGV 2 = " + Local_Global_Variable.age2); // default value
		System.out.println("NSGV 2 = " + ref.balls2); // default value
		age = 8;
		Local_Global_Variable.age2 = 6;
		ref.balls2 = 7;
		System.out.println("local.." + age); // local re-initialize value
		System.out.println("SGV 2 = " + Local_Global_Variable.age2); // SGV re-initialize value
		System.out.println("NSGV 2 = " + ref.balls2); // NSGV re-initialize value

		Local_Global_Variable ref2 = new Local_Global_Variable();
		// again create object getting base value again.
		
		System.out.println("NSGV 2.2 = " + ref2.balls2); // default value
	}
}
