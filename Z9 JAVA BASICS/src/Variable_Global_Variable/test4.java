package Variable_Global_Variable;

public class test4 {
	//non-static Global Variable
	int mobileNum=123;
	char grade='K';

	public static void main(String[] args) {
		
		System.out.println("Program Starts...");
		System.out.println("========================================");
		
		test4 r1=new test4();
		System.out.println("mobilenum with r1 reference: "+r1.mobileNum);                  // 123
		System.out.println("grade with r1 reference: "+r1.grade);                          // K
		System.out.println("========================================");
		
		test4 x1=new test4();
		System.out.println("mobilenum with x1 reference: "+x1.mobileNum);                  // 123
		System.out.println("grade with x1 reference: "+x1.grade);                          // K
		System.out.println("========================================");
		
		x1.mobileNum=987;
		x1.grade='A';
		System.out.println("updated, mobilenum with x1 reference: "+x1.mobileNum);         //987
		System.out.println("updated, grade with x1 reference: "+x1.grade);                 //A 
		System.out.println("========================================");
		
		r1.mobileNum=456;
		r1.grade='B';
		System.out.println("updated, mobilenum with r1 reference: "+r1.mobileNum);                  //456
		System.out.println("updated, grade with r1 reference: "+r1.grade);                          //B 
		System.out.println("========================================");
		System.out.println("Program Ends...");
	
	}

}
