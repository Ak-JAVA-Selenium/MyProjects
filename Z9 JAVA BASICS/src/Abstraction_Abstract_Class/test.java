package Abstraction_Abstract_Class;

//50 % abstract	
abstract class Demo3 {
	abstract void print(); // abstract method/incomplete method

	void display() { // non-abstract method
		System.out.println("I am a non-abstract method display()..Demo3");
	}
}

//0% abstract
abstract class Demo {
	void display1() {
		System.out.println("I am a non-abstract method display1()..Demo");
	}

	void display2() {
		System.out.println("I am a non-abstract method display2()..Demo");
	}
}

//100% abstract
abstract class Demo2 {
	abstract void print();

	abstract void print1();

	abstract void print2();
}

public class test {

	public static void main(String[] args) {
	}
}
/**
* class declared with Abstract keyword known as abstract class, 0 to 100% abstract
* it will have
* 			- abstract method ----> method declared with abstract keyword without body
* 			- non-abstract method --> normal method/concrete method
* 			- constructor
*  			- static method
*  			- global variable
*  Abstract class object can't be create as its incomplete class
*  
*  if any class contains even one abstract method then that class should be declared as abstract class
*  
*  when an abstract class is getting inherited by a sub class, then there will a contract between these classes thats
*  subclass needs to override all the abstract method of abstract class(super class) otherwise subclass becomes
*  abstract class
**/ 


