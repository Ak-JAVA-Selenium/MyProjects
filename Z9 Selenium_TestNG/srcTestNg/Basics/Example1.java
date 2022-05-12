package Basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	static void testCase1() {
		System.out.println("Hello, I am TC1 from example1 class");
	}
	@Parameters("name")
	@Test
	static void testCase2(String name) {
		System.out.println("Hello, I am TC1 from example2 class");
		System.out.println(name);
	}
	@Test
	static void testCase3() {
		System.out.println("Hello, I am TC1 from example3 class");
	}

}
