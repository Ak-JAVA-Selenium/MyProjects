package Variable_Global_Variable;

public class test1 {
	//Global variable
	long MobileNum = 965700;  // Non static global variable
	
	public static void main(String[] args) {
		                       // Creating instance/object.....
		test1 ref;             // no object created,initialize RefVariable only....(ClassName RefVariableName)
		ref = new test1();     // instance/object created..........................(RefVariableName = new ClassName)
		
		System.out.println("Start.......");
		System.out.println("NSGV ref="+ref.MobileNum); //Standard call for NSGV = RefVariableName.VariableName(NSGV)
		System.out.println("End.........");
		System.out.println("===============================");
	//OR	
		test1 ref1 = new test1();  // instance/object created.....(ClassName RefVariableName = new ClassName)
		
	    System.out.println("Start.......");
		System.out.println("NSGV ref1="+ref1.MobileNum);
		System.out.println("End.........");	
	}
}
/*
 * NSGV are known as instance/object variable
 * They are loaded in the memory at the time Execution time when the class instance/object is getting created
 * As they are instance/object variable, hence in order to access them we can create an instance/object of a class
 * 			className refVariable =  new className();
 * to access non-static member: refVariable.nonstaticvariablename
 * or we can also access NSGV directly from another non-static method
 * NonStatic members will have multiple memory allocation
 */
