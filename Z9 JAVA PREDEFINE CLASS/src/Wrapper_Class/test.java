package Wrapper_Class;

public class test {

	public static void main(String[] args) {

		int age = 20;
		System.out.println("Age: " + age);
		
		Integer intObj1 = new Integer(age);	// explicit boxing operation
		System.out.println("intObj1: " + intObj1);
		System.out.println(age == intObj1);
		
		Integer intObj2 = new Integer(50);	// explicit boxing operation
		System.out.println("intObj2: " + intObj2);
		
		Integer intObj3 = 30;	// implicit boxing operation or auto boxing operation
		System.out.println("intObj3: " + intObj3);
		System.out.println(intObj3.toString());// value--overrided
	}
}
/**
 * 	Wrapper class is a predefined class in java belongs to java.lang package
 * 	its used to convert primitive type to object type 
 * 			-----> boxing operation ---> implicitly or auto-boxing
 * 	converting back the boxed object into primitive type is known as 
 * 			-----> un-boxing operation ---> 
 * 
 * 	in wrapper class toString() & equals & '==' are overrided
**/ 

