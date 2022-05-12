package All_Topic_Practice;

/**  this()--> 
 * 			this statement is an instance of current class which is declared inside the constructor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 */
/*
* this keyword:
*  - Its an instance of current class.
*  - its use to differentiate non-static global and local variable when they have same name.
*  - or can be use to call non-static members of the class.
*  - its use in only in non-static method or members to call another non-static member.
*/
class ThisStatement {

	ThisStatement() {
		this(25.36);
		System.out.println("hello zero");
	}

	ThisStatement(double d) {
		this(15);
		System.out.println("hello double " + d);
	}

	ThisStatement(int x) {
		System.out.println("Hello int " + x);
	}
}

public class This_Statement_Keyword {

	int variable = 10;
	int age = 15;

	void method() {

		int age = 40;
		System.out.println("Value of L.age :" + age);
		System.out.println("Value of NGV.age :" + this.age);
		System.out.println("Value of variable :" + variable);
	}

	void method(int variable) {

		System.out.println("LV Value of variable :" + variable);
		System.out.println("NGV Value of variable :" + this.variable);
		this.variable = variable;
		System.out.println("LV Value of variable :" + variable);
		System.out.println("NGV Value of variable :" + this.variable);
		
		System.out.println("**********");
		method();
		
		System.out.println("**********");
		this.method();
	}

	public static void main(String[] args) {

//		ThisStatement a1 = new ThisStatement();
//		ThisStatement a2 = new ThisStatement();
//		ThisStatement a3 = new ThisStatement();

// Instead of that using this statement -->

		ThisStatement a4 = new ThisStatement();

		System.out.println("================================");

		This_Statement_Keyword a5 = new This_Statement_Keyword();
		
		System.out.println("variable :" + a5.variable + "\n");
		
		a5.method();
		System.out.println();
		
		a5.method(100);
		System.out.println();
		
		System.out.println("age :" + a5.age + "\n");
		
		System.out.println("variable :" + a5.variable + "\n");
	}
}
