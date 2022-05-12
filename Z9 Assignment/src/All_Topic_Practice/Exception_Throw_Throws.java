package All_Topic_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class UserDefinedException extends Exception {
	public UserDefinedException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}

public class Exception_Throw_Throws {

	public static void validateAge(int age) throws UserDefinedException {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote...manually
			throw new UserDefinedException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote");
		}
	}

	static void setSleep(long time) throws InterruptedException {
		Thread.sleep(time); // for thread we have to handle exception from throws..
		System.out.println("*** " + time);
	}

	static void checkNumber(int num) throws UserDefinedException {
		if (num < 0) {
			throw new UserDefinedException("Number less dn zero");
		} else {
			System.out.println("Number is :" + num);
		}
	}

	public static void main(String[] args) throws InterruptedException, UserDefinedException, FileNotFoundException {

		// exception handle using try catch..
		try {
			// throw an object of user defined exception
			throw new UserDefinedException("This is user-defined exception");
		} catch (UserDefinedException ude) {
			System.out.println("Caught the exception");
			// Print the message from MyException object
			System.out.println(ude);
			// System.out.println(ude.getMessage());
			// ude.printStackTrace();
		}
		System.out.println("====================================");
		try {
			validateAge(15);
		} catch (UserDefinedException e) {
			System.out.println("Caught the exception in validateAge ");
			System.out.println(e);
		}
		System.out.println("************************************");

		System.out.println("program starts");
		setSleep(5000);
		checkNumber(-1);
		System.out.println("Hello Geeks");

		System.out.println("************************************");

		// exception handle using throws...
		FileInputStream fis = new FileInputStream("fileLocation");
		System.out.println("Rest of the code..");
	}
}
