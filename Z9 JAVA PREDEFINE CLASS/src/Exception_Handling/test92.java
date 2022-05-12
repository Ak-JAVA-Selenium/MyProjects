package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class test92 {
	
	// defining a method
	public int divideNum(int m, int n) {
		int div = m / n;
		System.out.println(div);
		return div;
	}

	// main method
	public static void main(String[] args) throws FileNotFoundException {
		
		test92 obj = new test92();
		
		try {
			System.out.println(obj.divideNum(45, 0));
		} catch (ArithmeticException e) {
			System.out.println("\nNumber cannot be divided by 0");
		}
		
		FileInputStream fis = new FileInputStream("fileLocation");
		System.out.println("Rest of the code..");
		
		obj.divideNum(45, 0);
	}
}
