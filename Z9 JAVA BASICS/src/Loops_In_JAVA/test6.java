package Loops_In_JAVA;
							// Loop......Do-while loop..

public class test6 {

	public static void main(String[] args) {

		int c = 10;
		System.out.println("Printing all the numbers from 10 till 1");
		do {
			System.out.println(c);
			--c;
		} while (c > 0);
//========================================================================
		int day = 1;

		do {
			System.out.println("Day: " + day);
			day++;
		} while (day <= 20);
//========================================================================
		int n = 1 ;

		/* do-while loops execution */
		do {
			System.out.println("Java do while loops:" + n);
			n++;
		} while (n <= 0); // after printing statement,condition failed...& program stop
	}
}
