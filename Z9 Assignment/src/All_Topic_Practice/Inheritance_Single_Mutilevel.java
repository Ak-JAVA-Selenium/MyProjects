package All_Topic_Practice;
/**
 * Inheritance: When a child class inherit the property of it parent class known as Inheritance.
 * Representation:   	
 * 					class childclassname extends parentclassname {			}
 * Inheritance is achieve by using super() statement
 * 			--> used to call parent/super class constructor based on parameter.
 * 			--> super() should be the first statement inside the constructor body.
 * Note: In inheritance only non-static members involves. 
 * 		 super() and this() can't be written together
 * Types: Single,Multilevel,Hierarchical and Multiple.
 */
/*	Is java supports multiple inheritance or not?	No	*/

//parent class
class fourwheeler {
	// default constructor
	public void wheels() {
		System.out.println("I have 4 wheels");
	}
}

//child class of fourwheeler and parent of maruti
class car extends fourwheeler {
	// default constructor with default super()
	public void type() {
		System.out.println("I'm a car");
	}
}

//child class of car class
class maruti extends car {
	// default constructor with default super()
	public void company() {
		System.out.println("I'm maruti");
	}
}

public class Inheritance_Single_Mutilevel {

	public static void main(String[] args) {

		maruti a = new maruti();
		a.company();
		a.type();
		a.wheels();

		car b1 = new car();
		car b2 = new maruti();
		car b3 = a;
		b1.type();
		b1.wheels();

		fourwheeler c = new fourwheeler();
//		fourwheeler c = new maruti();
//		fourwheeler c = a;
//		fourwheeler c = new car();
//		fourwheeler c = b;
		c.wheels();
	}
}
