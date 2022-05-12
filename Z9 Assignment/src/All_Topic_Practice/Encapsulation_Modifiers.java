package All_Topic_Practice;
/**
 * -->Private members/modifiers can access within class only.
 * -->Default members/modifiers can access only within package.
 * -->Protected members/modifiers can access within package & 
 * 	  also outside the package through child class..(Inheritance).
 * -->Public members/modifiers can access anywhere (another class or package) but
 * 	  condition is...class in which members are present should have declared as "public".
 *
 * For Public & Protected members:
 * 		--> outside the package need to be use "import keyword".
 * 			import package.*; --> all classes of this package will be accessible.
 * 			import package.classname; --> declared class of this package will be accessible.
 * 			using fully qualified class name -->  packagename.classname
 * 				*declared class of this package will be accessible.
 * 				*No need to import.
 * 				*but need to use every time when you are accessing the class.
 */
class Encpsltn_Mdfr {

	private int num1 = 10;
	int num2 = 20; // default
	protected int num3 = 30;
	public int num4 = 40;
}

public class Encapsulation_Modifiers {

	public static void main(String[] args) {

		Encpsltn_Mdfr ref = new Encpsltn_Mdfr();

		System.out.println("Private declared Variable : can't access outside class");
		System.out.println("Default declared Variable : " + ref.num2);
		System.out.println("Public declared Variable : " + ref.num3);
		System.out.println("Protected declared Variable : " + ref.num4);
	}
}
