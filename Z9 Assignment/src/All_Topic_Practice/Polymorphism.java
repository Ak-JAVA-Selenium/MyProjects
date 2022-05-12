package All_Topic_Practice;

/**
 * Polymorphism : * Compile Time * Runtime
 * 		To achive compile time polymorphism :
 * 									> Overloading
 * 		To achive runtime polymorphism :
 * 									> Inheritance, > Up-Casting, > Overriding
 * 	Runtime polymorphism can't be achive by Data Members.	
 */
class Hillstation {
	void location() {
		System.out.println("Location is:");
	}

	void famousfor() {
		System.out.println("Famous for:");
	}
}

class Manali1 extends Hillstation {
	void location() {
		System.out.println("Manali is in Himachal Pradesh");
	}

	void famousfor() {
		System.out.println("It is Famous for Hadimba Temple and adventure sports");
	}
}

class Mussoorie1 extends Hillstation {
	void location() {
		System.out.println("Mussoorie is in Uttarakhand");
	}

	void famousfor() {
		System.out.println("It is Famous for education institutions");
	}
}

class Gulmarg1 extends Hillstation {
	void location() {
		System.out.println("Gulmarg is in J&amp;K");
	}

	void famousfor() {
		System.out.println("It is Famous for skiing");
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		Hillstation A = new Hillstation();
		A.location();
		A.famousfor();
		Hillstation M = new Manali1();
		M.location();
		M.famousfor();
		Hillstation Mu = new Mussoorie1();
		Mu.location();
		Mu.famousfor();
		Hillstation G = new Gulmarg1();
		G.location();
		G.famousfor();
	}
}
