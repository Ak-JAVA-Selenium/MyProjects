package Abstraction_Abstract_Class;

abstract class Bike {
	abstract void run();

	void speed(int spd) {
		System.out.println("Bike speed: " + spd);
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely");
	}

	void speed(int spd) {
		System.out.println("Honda speed: " + spd);
		super.speed(120);
	}

	void color() {
		System.out.println("Honda color is blue");
	}
}

public class test0 {

	public static void main(String[] args) {

		Honda obj = new Honda();
		obj.run();
		obj.speed(60);
		obj.color();
		System.out.println("===========================");
		
		Bike b2 = new Honda();
		b2.run();
		b2.speed(20);
		
		// Bike b1=new Bike();
		// b2.color();
	}
}
