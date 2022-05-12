package Inheritance_Method_Overriding;

class Animal {
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {
	public void move() {
		System.out.println("Dogs can walk and run");
	}

	public void bark() {
		System.out.println("Dogs can bark");
	}
}

public class test {
	
	public static void main(String args[]) {
		
		Animal a = new Animal();
		a.move();
		System.out.println("********************************************");
		Dog b = new Dog();
		b.move();
		b.bark();
		System.out.println("********************************************");
		Animal c = new Dog();
		c.move();
		// c.bark(); // c compile time error since b's reference type Animal doesn't
		System.out.println("********************************************");
		Animal d = b;
		d.move();
	}
}
