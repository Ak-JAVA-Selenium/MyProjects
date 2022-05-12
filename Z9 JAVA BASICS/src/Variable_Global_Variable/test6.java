package Variable_Global_Variable;

public class test6 {
	// Non static global variable
	int MobileNum;
	// we get result as default value of data type...

	public static void main(String[] args) {
		
		test6 ref = new test6();               // Instance/object created.........  
        
		System.out.println("Start.......");
		System.out.println("NSGV ref="+ref.MobileNum);
		System.out.println("End.........");
		System.out.println("================================");
		
		ref.MobileNum = 10002;                 // changing/updating NSGV......
		
		System.out.println("Start.......");
		System.out.println("NSGV (updated) ref="+ref.MobileNum);
		System.out.println("End.........");
		System.out.println("================================");
	}

}
