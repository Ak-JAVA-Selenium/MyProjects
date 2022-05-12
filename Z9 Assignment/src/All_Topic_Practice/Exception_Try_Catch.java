package All_Topic_Practice;

/**
 * try block can have multiple catch block, but only one catch block will be
 * executed try can handle only one abnormal condition at a time
 */
public class Exception_Try_Catch {

	public static void main(String[] args) {

		System.out.println("program starts from here...");

		// 1. abnormal statements
		int i = 10;
		int j = i / 0;// ArithmeticException
		System.out.println("res: " + j);

		// 2. abnormal statements
		int[] empIds = new int[3];
		empIds[6] = 101;// ArrayIndexOutOfBoundsException

		// 3. abnormal statements
		String str = null;
		System.out.println(str.length());// NullPointerException

		// 4. abnormal statements
		String s = "abc";
		int num = Integer.parseInt(s);// NumberFormatException
		System.out.println("num: " + num);

		System.out.println("Programs ends here...");
		System.out.println("Start of the code...");
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;// below code throws divide by zero exception

		} catch (ArithmeticException e) {// handles the Arithmetic Exception / Divide by zero exception
			System.out.println("Arithmetic Exception occurs");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");

		} catch (Exception e) {
			System.out.println("Parent Exception occurs");

		} finally { // executes regardless of exception occured or not
			System.out.println("finally block is always executed");

			System.out.println("I am inside finally block");
			try {
				int k = 10 / 0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally block is always executed");
		}
		System.out.println("Rest of the code...");

		/** unreachable code: a block of code which never executes by JVM */
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("common task completed");
//		} catch (ArithmeticException e) {
//			System.out.println("task1 is completed");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("task 2 completed");
		}
		System.out.println("rest of the code...");

	}
}
