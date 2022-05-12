package All_Topic_Practice;
/**
 * super: is a keyword or instance of parent class use to refer super/parent class. 
 * Non-static members mainly differentiate when subclass and super class having common non-static members.
 */
class Grandfather {
	int Grandfatherage = 60;

	Grandfather(char y) {
		System.out.println("I am Class Grandfather constrctuor..." + y);
	}

	void myHome() {
		System.out.println("I am home of Grandfather");
	}

	void all() {
		int Grandfatherage = 61;
		System.out.println("Grandfatherage : " + Grandfatherage);
		System.out.println("Grandfatherage : " + this.Grandfatherage);
	}
}

class Father extends Grandfather {
	int fatherage = 40;

	Father(double d) {
		super('A');
		System.out.println("I am Class Father constrctuor..." + d);
	}

	void myHome() {
		System.out.println("I am home of Grandfather gives father");
	}

	void myCar() {
		System.out.println("I am car of Father");
	}

	void all1() {
		int fatherage = 41;
		System.out.println("agenow : " + fatherage);
		System.out.println("age : " + this.fatherage);
		System.out.println("Grandfather age : " + super.Grandfatherage);
	}
}

class Son extends Father {
	int sonage = 20;

	Son(int i) {
		super(12.13);
		System.out.println("I am Class Son constrctuor..." + i);
	}

	void myBike() {
		System.out.println("I am bike of Son");
	}

	void myHome() {
		System.out.println("I am home of Grandfather gives Son");
	}

	void myCar() {
		System.out.println("I am car of Father gives Son");
	}

	void all2() {
		int sonage = 21;
		System.out.println("sonage : " + sonage);
		System.out.println("sonage : " + this.sonage);
		System.out.println("father age : " + super.fatherage);
		System.out.println("Grandfather age : " + super.Grandfatherage);
	}
}

public class Inheritance_Super_Keyword {

	public static void main(String[] args) {

		System.out.println("******************start********************");

		Son c1 = new Son(21);
		c1.myHome();
		c1.myCar();
		c1.myBike();
		c1.all2();

		System.out.println("*******************************************");
		Father f1 = c1;
		f1.myHome();//Overriding
		f1.myCar();//Overriding
		f1.all1();

		System.out.println("*******************************************");
		Grandfather g1 = c1;
		g1.myHome();//Overriding
		g1.all();

		System.out.println("*******************************************");
		Grandfather g4 = new Grandfather('B');
		g4.myHome();

		System.out.println("*******************************************");
		Grandfather g2 = new Son(22);
		g2.myHome();//Overriding

		System.out.println("*******************************************");
		Grandfather g3 = new Father(12.34);
		g3.myHome();//Overriding

		System.out.println("*******************************************");
		Father f3 = new Father(23);
		f3.myHome();
		f3.myCar();

		System.out.println("*******************************************");
		Father f2 = new Son(23);
		f2.myHome();//Overriding
		f2.myCar();//Overriding

		System.out.println("**************end**************************");
	}
}