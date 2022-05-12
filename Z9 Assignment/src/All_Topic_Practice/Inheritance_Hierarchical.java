package All_Topic_Practice;

//parent class
class AutoVehicle {
	public void wheels() {
		System.out.println("I have wheels");
	}
}

//first child class of vehicle class
class bike extends AutoVehicle {
	public void countwl() {
		System.out.println("I am a bike and has 2 wheels");
	}
}

//second child class of vehicle class
class Car1 extends AutoVehicle {
	public void countwl1() {
		System.out.println("I am a car and has 4 wheels");
	}
}

//third child class of vehicle class
class scooter extends AutoVehicle {
	public void countwl2() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}

public class Inheritance_Hierarchical {

	public static void main(String[] args) {

		scooter sc = new scooter();// object of scooter class
		sc.wheels();
		sc.countwl2();

		Car1 c = new Car1();// object of car class
		c.wheels();
		c.countwl1();

		bike b = new bike();// object of bike class
		b.wheels();
		b.countwl();
		
		AutoVehicle v1 = new AutoVehicle();
		AutoVehicle v2 = sc;
		AutoVehicle v3 = c;
		AutoVehicle v4 = b;
		v1.wheels();
	}
}