package Singleton_Class;
/**
 * 1. constructor should be private 
 * 2. create static ref variable of the class
 * 3. create static method which return current class object
 */
class Singleton {

	// 1. constructor should be private
	private Singleton() {
		System.out.println("Sampleton class cons");
	}

	// 2. create static ref variable of the class
	static Singleton singleObj = new Singleton();

	// 3. create static method which return current class object
	public static Singleton getSampletonObject() {
		return singleObj;
	}

	void display() {
		System.out.println("I am display()");
	}
}

public class test {

	public static void main(String[] args) {

		// Singleton s1=new Singleton();
		// error as Singleton class constructor declared as private..can't load non-static member
		
		Singleton.getSampletonObject().display(); // or
		Singleton s2 = Singleton.getSampletonObject();
		// indirect meaning---> Singleton.getInstance() ---> singleObj --->new Singleton();
		s2.display();
	}
}