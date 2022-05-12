package Inheritance_Super_Keyword;

//parent class
class fruits {
	int fruitAge;

	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}

	public void taste() {
		System.out.println("Fruits are sweet");
	}
}

//child class of fruit
class orange extends fruits {
	int fruitAge;

	orange() {
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}

	public void taste() {
		System.out.println("orange are sweet");
	}

	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: " + fruitAge);
		System.out.println("Fruits fruitAge: " + super.fruitAge);
		System.out.println("===========");
		taste();
		super.taste();
	}
}

public class test0 {
	public static void main(String[] args) {

		System.out.println("*******************************************");
		orange o1 = new orange();
		System.out.println("*******************************************");
		o1.shape();
		System.out.println("*******************************************");
		o1.taste();
	}
}
/*
 * super: is a keyword or instance of parent class use to refer super class
 * non-static members mainly differentiate when subclass and super class having common non-static members
 */
