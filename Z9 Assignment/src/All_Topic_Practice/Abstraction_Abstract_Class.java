package All_Topic_Practice;
/**
* Class declared with Abstract keyword known as Abstract Class,It's 0 to 100% abstract.
* it will have:
* 			- abstract method ----> method declared with abstract keyword without body [....();]
* 			- non-abstract method --> normal method/concrete method.
* 			- constructor.
*  			- static method.
*  			- global variable.
*  Abstract class object can't be create as its incomplete class.
*  Abstract is a non-access modifier.
*  if any class contains even one abstract method then that class should be declared as abstract class.
*  
*  when an abstract class is getting inherited by a sub class, then there will a contract between these classes thats-
*  subclass needs to override all the abstract method of abstract class(super class) otherwise subclass becomes abstract class
**/ 

//50 % abstract class
abstract class Vehicletype {
	abstract void run();// abstract method/incomplete method

	// final abstract void color();
	/** Abstract mean must be overridden & final means can't be override. **/

	void speed(int spd) {// non-abstract method
		System.out.println("Vehicle speed: " + spd);
	}
}

//In real scenario, implementation is provided by others i.e. unknown by end user
class Honda extends Vehicletype {
	void run() {
		System.out.println("running safely Honda");
	}

	void speed(int spd) {
		System.out.println("Honda speed: " + spd);
		super.speed(100);
	}

	void color() {
		System.out.println("Honda color is blue");
	}
}

class Bike1 extends Vehicletype {
	void run() {
		System.out.println("running safely Bike");
	}

	void speed(int spd) {
		System.out.println("Bike speed: " + spd);
		super.speed(50);
	}

	void color() {
		System.out.println("Bike color is red");
	}
}

//In real scenario, method is called by programmer or user
public class Abstraction_Abstract_Class {

	public static void main(String[] args) {

		System.out.println("============Start==============");

		Honda a = new Honda();
		a.run();
		a.speed(120);
		a.color();
		System.out.println("===============================");

		Bike1 b = new Bike1();
		b.run();
		b.speed(70);
		b.color();
		System.out.println("===============================");

		Vehicletype c = new Honda();
		c.run();
		c.speed(140);
		System.out.println("===============================");

		Vehicletype d = new Bike1();
		d.run();
		d.speed(90);

		System.out.println("=============End===============");
	}
}
