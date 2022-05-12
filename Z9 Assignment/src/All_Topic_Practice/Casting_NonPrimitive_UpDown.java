package All_Topic_Practice;

/* 	Derived type casting... */
/**
 * child class object referred by any of its parent known as up casting.
 * 
 * parent class object referred by any of its child class known as downcasting.
 * directly downcasting is not possible in java.
 * 
 * Child c2 = new Parent(); //downcasting...but not possible in this way.
 * 
 * Parent p1 = new Child();
 * 
 * Child c1 = (Child) p1; //downcasting...as upcasting object is getting down casted here.
 */
class Maharashtra {
	void location1() {
		System.out.println("Welcome,You are in Maharashtra");
	}

	void info() {
		System.out.println("Maharashtra is state in india (First)");
	}
}

class Kokan extends Maharashtra {
	void location2() {
		System.out.println("Welcome,You are in Kokan");
	}

	void info() {
		System.out.println("Kokan is Division in Maharashtra (Secound)");
	}
}

class Ratnagiri extends Kokan {
	void location3() {
		System.out.println("Welcome,You are in Ratnagiri");
	}

	void info() {
		System.out.println("Ratnagiri is District in Maharashtra (Secound Last)");
	}
}

class Chiplun extends Ratnagiri {
	void location4() {
		System.out.println("Welcome,You are in Chiplun");
	}

	void info() {
		System.out.println("Chiplun is City in Ratnagiri (Last)");
	}
}

public class Casting_NonPrimitive_UpDown {

	public static void main(String[] args) {

		/** Creating objects of each class individually... **/

		Chiplun c1 = new Chiplun();
		Ratnagiri r1 = new Ratnagiri();
		Kokan k1 = new Kokan();
		Maharashtra m1 = new Maharashtra();

		/** Implicit / Auto Up-Casting... **/

		Ratnagiri r2 = new Chiplun();
		Ratnagiri r3 = c1;

		Kokan k2 = new Chiplun();
		Kokan k3 = c1;
		Kokan k4 = new Ratnagiri();
		Kokan k5 = r1;

		Maharashtra m2 = new Chiplun();
		Maharashtra m3 = c1;
		Maharashtra m4 = new Ratnagiri();
		Maharashtra m5 = r1;
		Maharashtra m6 = new Kokan();
		Maharashtra m7 = k1;

		/** Explicit Up-Casting... **/

		Ratnagiri r4 = (Ratnagiri) new Chiplun();
		Ratnagiri r5 = (Ratnagiri) c1;

		Kokan k6 = (Kokan) new Chiplun();
		Kokan k7 = (Kokan) c1;
		Kokan k8 = (Kokan) new Ratnagiri();
		Kokan k9 = (Kokan) r1;

		Maharashtra m8 = (Maharashtra) new Chiplun();
		Maharashtra m9 = (Maharashtra) c1;
		Maharashtra m10 = (Maharashtra) new Ratnagiri();
		Maharashtra m11 = (Maharashtra) r1;
		Maharashtra m12 = (Maharashtra) new Kokan();
		Maharashtra m13 = (Maharashtra) k1;

		/** Explicit Down-Casting... **/
		// ( Implicit Down-Casting not possible and also only Up-Casted objects can Down-Casted.)

		Chiplun r6 = (Chiplun) r4;
		Chiplun r7 = (Chiplun) r5;

		Chiplun k10 = (Chiplun) k6;
		Ratnagiri k11 = (Ratnagiri) k6;
		Chiplun k12 = (Chiplun) k7;
		Ratnagiri k13 = (Ratnagiri) k7;
		Ratnagiri k14 = (Ratnagiri) k8;
		Ratnagiri k15 = (Ratnagiri) k9;

		Chiplun m14 = (Chiplun) m8;
		Ratnagiri m15 = (Ratnagiri) m8;
		Kokan m16 = (Kokan) m8;
		Chiplun m17 = (Chiplun) m9;
		Ratnagiri m18 = (Ratnagiri) m9;
		Kokan m19 = (Kokan) m9;
		Ratnagiri m20 = (Ratnagiri) m10;
		Kokan m21 = (Kokan) m10;
		Ratnagiri m22 = (Ratnagiri) m11;
		Kokan m23 = (Kokan) m11;
		Kokan m24 = (Kokan) m12;
		Kokan m25 = (Kokan) m13;
	}
}