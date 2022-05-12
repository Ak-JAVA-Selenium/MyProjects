package All_Topic_Practice;
/**
 * 	Wrapper class is a predefined class in java belongs to java.lang package
 * 	its used to convert primitive type to object type 
 * 			-----> boxing operation ---> implicitly or auto-boxing
 * 	converting back the boxed object into primitive type is known as 
 * 			-----> un-boxing operation ---> 
 * 
 * 	in wrapper class toString() & equals & '==' are overrided
**/ 
public class Wrapper_Class {

	public static void main(String[] args) {

		int age = 20;
		System.out.println("Age : " + age);
		
		// Converting int into Integer
		Integer age1 = new Integer(age);// converting int into Integer explicitly
		System.out.println("Age1 : " + age1);
		
		Integer age2 = age;// // implicitly or auto-boxing, now compiler will write Integer.valueOf(a) internally
		System.out.println("Age1 : " + age2);
		
		// Converting Integer to int
		int age4 = age1.intValue();// Unboxing of boxed object, converting Integer to int explicitly
		System.out.println("Age4 : " + age4);
		int age5 = age2.intValue();// converting Integer to int explicitly
		System.out.println("Age5 : " + age5);
		
		System.out.println("Age1.equals(age) : " + age1.equals(age));
		System.out.println("Age2 == age : " +(age2==age));
		
		Integer age6 = new Integer(30);
		System.out.println("Age6.equals(age) : " + age6.equals(age));// toString() overrided
		System.out.println("Age6 == age : " +(age6==age));// equals overrided
	}
}
