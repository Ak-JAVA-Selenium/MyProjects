package Variable_Global_Variable;

public class test2 {
	// Non static global variable
	int MobileNum = 7007;

	public static void main(String[] args) {
		
		test2 ref = new test2();
		
		System.out.println("Start.......");
		System.out.println("NSGV ref="+ref.MobileNum);
		System.out.println("End.........");
		
		System.out.println("================================");
	
		ref.MobileNum = 8008;                 // changing/updating NSGV......
		
		System.out.println("Start.......");
		System.out.println("NSGV (updated) ref="+ref.MobileNum);
		System.out.println("End.........");	
	}

}
