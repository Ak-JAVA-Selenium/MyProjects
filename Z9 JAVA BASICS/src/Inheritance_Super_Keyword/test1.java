package Inheritance_Super_Keyword;

//parent class
class fruitA {
	int fruitAge;

	fruitA() {
		System.out.println("fruitA class cons..");
		fruitAge = 33;
	}

	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
//child class of fruit
class mango extends fruitA {
	int fruitAge;

	mango() {
		// super();
		System.out.println("mango class Cons..");
		fruitAge = 55;
		System.out.println(fruitAge);
		System.out.println(super.fruitAge);
	}

	public void taste() {
		System.out.println("Mango are Tart in taste");
	}

	public void shape() {
		System.out.println("mango is round");
	}
}
public class test1 {
	
	public static void main(String[] args) {
		
		System.out.println("*******************************************");
		
		mango m1 = new mango();
		m1.shape();//
		m1.taste();//
		System.out.println(m1.fruitAge);//
		System.out.println("*******************************************");

		fruitA f1 = new fruitA();
		f1.taste();//
		System.out.println(f1.fruitAge);//
		System.out.println("*******************************************");
		
		fruitA f2 = m1;
		f2.taste();//
		System.out.println(f2.fruitAge);//
		System.out.println("*******************************************");
		
		fruitA f3 = new mango();
		f3.taste();//
		System.out.println(f3.fruitAge);//
		System.out.println("*******************************************");
	}
}
