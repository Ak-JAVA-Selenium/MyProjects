package Constructor_This_Keyword;

public class test3 {

	int variable = 10;
	int age = 15;

	public static void main(String args[]) {
		
		test3 obj = new test3();
		obj.method(20);
		obj.method();
		System.out.println("obj GV variable: " + obj.variable);//
		test3 obj2 = new test3();
		System.out.println("obj2 GV variable: " + obj2.variable);//
	}

	void method(int variable) {
		
		System.out.println("LV Value of variable :" + variable);// 20
		System.out.println("GV Value of variable :" + this.variable);// 10
		this.variable = variable;
		System.out.println("LV Value of variable :" + variable);// 20
		System.out.println("GV Value of variable :" + this.variable);// 20
	}

	void method() {
		
		int variable = 40;
		System.out.println("Value of variable :" + variable);
		System.out.println("Value of variable :" + age);
	}
}
