package All_Topic_Practice;

/*    for ( initialization ; condition ; incr/decr ) {   }     */
public class Loops_For_While_DoWhile {

	public static void main(String[] args) {

		// For Loop.........
		for (int i = 1; i < 101; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n*************Reverse****************");
		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println("==================================");

		// Loop....For--For--
		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					++counter;
				}
			}
			if (counter == 2) {
				System.out.println("Prime Number: " + i);
			}
		}
		System.out.println("==================================");

		// Loop.......While loop...
		int i = 1;
		System.out.println("Printing numbers from 1 to 15");
		while (i <= 15) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println("==================================");

		// Loop......Do-while loop..
		int n = 1;
		/* do-while loops execution */
		do {
			System.out.println("Java do while loops:" + n);
			n++;
		} while (n <= 0); // after printing statement,condition failed...& program stop
	}
}
