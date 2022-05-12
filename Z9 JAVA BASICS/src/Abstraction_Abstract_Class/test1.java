package Abstraction_Abstract_Class;

//Abstract class
abstract class Animal {
	// Abstract method (does not have a body)
	public abstract void animalSound();

	// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

// Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}

//Subclass (inherit from Animal)
class Dog8 extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bow bow");
	}
}

public class test1 {

	public static void main(String[] args) {

		Pig Pig = new Pig(); // Create a Pig object
		
		Pig.animalSound();
		Pig.sleep();
		
		Dog8 dog = new Dog8();
		
		dog.animalSound();
		dog.sleep();
	}
}
