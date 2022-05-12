package Polymorphism_Compile_Runtime;

class Bike {
	int speedlimit;

	Bike() {
		speedlimit = 90;
	}
}

class Honda3 extends Bike {
	int speedlimit;

	Honda3() {
		super();
		speedlimit = 150;
	}
}

public class test {

	public static void main(String args[]) {
		
		Bike obj = new Honda3();
		System.out.println(obj.speedlimit);// 150
		Honda3 obj1 = new Honda3();
		System.out.println(obj1.speedlimit);
	}
}