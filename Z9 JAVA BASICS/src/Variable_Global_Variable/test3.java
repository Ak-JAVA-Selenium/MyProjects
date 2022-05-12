package Variable_Global_Variable;

public class test3 {
	// Non static global variable
	int MobileNum = 10001;

	public static void main(String[] args) {
		
		test3 ref = new test3();               // Instance/object created.........  
		                                       
		System.out.println("Start.......");
		System.out.println("NSGV ref="+ref.MobileNum);
		System.out.println("End.........");
		System.out.println("================================");
	
		ref.MobileNum = 10002;                 // changing/updating NSGV......
		
		System.out.println("Start.......");
		System.out.println("NSGV (updated) ref="+ref.MobileNum);
		System.out.println("End.........");
		System.out.println("================================");
		
		test3 ref2 = new test3();              // New instance/object created but the base NSGV value reflected always..
		
		System.out.println("Start.......");
		System.out.println("NSGV (Base Declared NSGV) ref="+ref2.MobileNum);
		System.out.println("End.........");
		System.out.println("================================");	
	}

}
