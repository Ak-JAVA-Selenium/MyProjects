package Encapsulation_Modifiers_Pakage;

//import JAVA_Basic.test7trialclassformodifiers;
// or
import JAVA_Basic.*;

public class test4 extends test7trialclassformodifiers{

	public static void main(String[] args) {

		//using fully qualified class name: packagename.classname
		//JAVA_Basic.test7trialclassformodifiers m1 = new test4();
		test4 m1 = new test4();
		//System.out.println("private variable: " + m1.num1);
		//System.out.println("default variable: " + m1.num2);
		System.out.println("protected variable: " + m1.num3);
		System.out.println("public variable: " + m1.num4);
	}
}
