package Variable_Global_Variable;

public class test5 {
	//static global variable...standard calling method example.....
	static int age = 30;
	static double salary = 2006.43;
	static char grade = 'A';
	static boolean ans = true;
	
	public static void main(String[] args) {
		System.out.println("Program starts.........");
		
		System.out.println("age"+age);            // Before same local variable declared..we can call directly SGV
		System.out.println("age"+test5.age);      // Standard call for SGV....
		
		// local variable declared.......
				int age = 31;                 
				double salary = 2666.44;
				char grade = 'B';
				boolean ans = false;
		
		System.out.println("age"+age);
		System.out.println("age"+test5.age);
		
		System.out.println("salary"+salary);        // Local V.....
		System.out.println("salary"+test5.salary);  // Standard call for SGV..
		
		System.out.println("grade"+grade);
		System.out.println("grade"+test5.grade);
		
		System.out.println("ans"+ans);
		System.out.println("ans"+test5.ans);	
		
		System.out.println("Program end.........");
	}

}
