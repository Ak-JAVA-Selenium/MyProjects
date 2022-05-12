package All_Topic_Practice;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {

		Scanner scnRef = new Scanner(System.in);
		
		int age;
		double salary;
		String name;
		boolean valid;
		
		/* Initialization of variable using Scanner class */
		System.out.println("Get age value from console");
		age = scnRef.nextInt();
		
		System.out.println("Get salary value from console");
		salary = scnRef.nextDouble();
		
		System.out.println("Get name value from console");
		name = scnRef.next();
		
//		name = scnRef.nextLine();
		
		System.out.println("Enter true/false value from console");
		valid = scnRef.nextBoolean();

		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		System.out.println("name: " + name);
		System.out.println("valid: " + valid);
	}
}
