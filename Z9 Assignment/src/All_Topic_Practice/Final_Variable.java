package All_Topic_Practice;
//Final Variable........

public class Final_Variable {

	static final int empId = 100;

	final int empId2 = 200;

	public static void main(String[] args) {

		final int empId = 300;

		System.out.println("EmpId: " + empId);

		Final_Variable ref = new Final_Variable();
		System.out.println("EmpId: " + ref.empId2);

		System.out.println("EmpId: " + Final_Variable.empId);

/**     final variable value need to be initialize at time of declaration 
        & can't be re-initialize/change     **/
		
//		empId=10;
//		ref.empId=20;
//		test1.empId=30;
	}
}
