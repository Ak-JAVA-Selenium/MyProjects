package Variable_Global_Variable;

public class test {
		// Global Variables:
		// static double age = 50;     ( Static global variable = SGV )...start with keyword 'static'
	    // long age = 30;              ( Non-static Global Variable = NSGV )
		
	static int age=25;

	public static void main(String[] args) {
		
		System.out.println("SGV : "+age);
		System.out.println("SGV with standard: "+test.age);
		System.out.println("***********************************");
		
		age=30;	                  // Replace/override/change-static global variable.
		
		System.out.println("SGV : "+age);
		System.out.println("SGV with standard: "+test.age);
		System.out.println("***********************************");
		
		int age=35;               //local Variable initialize/Declared.
		
		System.out.println("Local Variable : "+age);
		System.out.println("SGV with standard: "+test.age);        //"classname.staticvariablename" is standard call for SGV....
		System.out.println("***********************************");
	}
}
/*
 * SGV are known as class variable
 * They are loaded in the memory at the time compilation when the class is getting created
 * As they are class variable, hence in order to access them we can use "classname.staticvariablename" name
 * or we can also access SGV directly from another static method
 * Static members will be have single memory allocation
*/
