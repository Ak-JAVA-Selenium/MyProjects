package Variable_Global_Variable;

public class test0 {
	// SGV not initialized only declared...but we get result as default value of data type;
	static int age;
	static float Temp;
	static double salary;
	static char attendance;
	static boolean ans;

	public static void main(String[] args) {
		
		System.out.println("age ="+age);
		System.out.println("Temp ="+Temp);
		System.out.println("salary ="+salary);
		System.out.println("attendance ="+attendance);       // result is '_'(Space)...
		System.out.println("ans ="+ans); 
		System.out.println("================================");
		/*
		int Num;  // Error (Local variable initialization is mandatory..it can't take default value of datatype )
		System.out.println("Num ="+Num);
		System.out.println("================================");
		*/
		int Num1 = 34;           //Local variable need to be initialize...
		System.out.println("Num1 ="+Num1);	
	}

}
