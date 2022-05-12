package All_Topic_Practice;
/**
 * Interface--> used to achieve abstraction in java
 * 			--> as we know java doesn't support multiple inheritance using classes to overcome,
 *  			thus java provides interface to support this. 
 * 			--> its 100% abstract, No non-abstract method.
 * 			--> inside interface will have-(no constructor)
 * 					- variable ---> public static final
 * 					- methods  ---> public abstract
 * 			--> Whenever a sub class inherits the interface they use implements keyword
 * 				class childclass implements interfacename{
 * 				}
 * 			--> As we are not allowed to create an instance of abstract class similarly we are not allowed to create
 * 				instance of interface(because its also incomplete)
 * 			--> when a interface is getting inherited by a sub class, then there will a contract between these classes,
 * 				thats subclass needs to override all the abstract method of interface otherwise subclass becomes abstract class.
 * 			--> if interfaces having common/same abstract method, subclass needs to override that abstract method only once.
 * 			--> between 
 * 					1. two classes we use 'extends'
 * 					2. two interface we use 'extends' 
 * 					3. class and interface use 'implements' 
**/
// interface:
// variable ---> by default ----> public static final
// method   ---> by default ----> public abstract
// no complete methods/non-abstract methods
// no constructor
interface Animals {
	int ageAnimals = 20;// by default--> public static final int age = 20;

	void animalSound();// public abstract void animalSound();

	void sleep();// interface method (does not have a body)
}

interface Pets extends Animals {
	int agePets = 30;

	void animalSound1();

	void sleep();
}

class Cat implements Pets {

	public void animalSound() {
		System.out.println("animalSound() of interface Animal");
	}

	public void animalSound1() {
		System.out.println("animalSound1() of interface Pets");
	}

	public void sleep() {
		System.out.println("sleep() of interface Animal & Pets & Mammals");
	}
}

interface Mammals {
	int ageMammals = 40;

	void animalSound2();

	void sleep();
}

class Dog extends Cat implements Mammals {

	public void animalSound2() {
		System.out.println("animalSound2() of interface Mammals");
	}
}

/**
 * Since Java 8,we can have default & static method in interface.
 * ---------- 9,----------- private method in an interface.
 */
interface Fish {

	default void sea() {
		System.out.println("default method");
	}

	static int cube(int x) {
		return x * x * x;
	}
//	default static int print(){ // default static can't be written together
//	}  
}

public class Abstraction_Interface {

	public static void main(String[] args) {

		System.out.println("=============Start================\n");

		Cat a1 = new Cat();
		a1.animalSound();
		a1.animalSound1();
		a1.sleep();
		System.out.println("==================================\n");

//		Pets a2 = a1;
		Pets a3 = new Cat();
		a3.animalSound();
		a3.animalSound1();
		a3.sleep();
		System.out.println("==================================\n");

//		Animals a4 = a1;	
//		Animals a5 = a2;
//		Animals a6 = a3;
		Animals a7 = new Cat();
		a7.animalSound();
		a7.sleep();
		System.out.println("==================================\n");

		Dog b1 = new Dog();
		b1.animalSound();
		b1.animalSound1();
		b1.animalSound2();
		b1.sleep();
		System.out.println("==================================\n");

//		Mammals b2 = b1;
		Mammals b3 = new Dog();
		;
		b3.animalSound2();
		b3.sleep();
		System.out.println("==================================\n");

		Cat c1 = new Dog();
//		Cat c2 = b1;
//		Cat c3 = b2;
//		Cat c4 = b3;
		c1.animalSound();
		c1.animalSound1();
		c1.sleep();
		System.out.println("==================================\n");

		System.out.println("Variable of interface Animals: " + Dog.ageAnimals);
		System.out.println("Variable of interface Pets: " + Dog.agePets);
		System.out.println("Variable of interface Mammals: " + Dog.ageMammals);
//		System.out.println(" "+Animals.ageAnimals+" "+Pets.agePets+" "+Cat.ageAnimals+" "+Cat.agePets);
//		System.out.println(" "+Dog.ageAnimals+" "+Dog.agePets+" "+Dog.ageMammals+" "+Mammals.ageMammals);
		System.out.println("==================================");
	}
}
