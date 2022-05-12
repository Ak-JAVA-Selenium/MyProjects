package Inheritance_Super_Keyword;

class Grandfather {
	Grandfather(char y) {
		System.out.println("I am Class Grandfather constrctuor..."+y);
	}

	void myHome() {
		System.out.println("I am home of Grandfather");
	}
}
class Father extends Grandfather {
	Father(double d) {
		super('A');
		System.out.println("I am Class Father constrctuor..."+d);
	}

	void myCar() {
		System.out.println("I am car of Father");
	}
}
class Child1 extends Father {
	Child1(int i) {
		super(12.34);
		System.out.println("I am Class Child constrctuor..."+i);
	}

	void myBike() {
		System.out.println("I am bike of child");
	}
}
public class test {
	
	public static void main(String[] args) {

		System.out.println("*******************************************");
		Child1 c1 = new Child1(21);// 5 15 25
		c1.myHome();//9
		c1.myCar();//18
		c1.myBike();//28
		
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Father f1 = c1;// Father f2 = new Child1(21); home, car but bike will not be visible/accessible to father
		f1.myHome();
		f1.myCar();
		
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g1 = c1;// Grandfather g2=new Child1(20); home but car & bike will not be visible/accessible to Grandfather
		g1.myHome();
		
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g2 = new Child1(22);// home but car , bike will not be visible/accessible to father
		g2.myHome();
		
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Father f2 = new Child1(23);// Father f2 = new Child1(21); home, car but bike will not be visible/accessible to father
		f2.myHome();
		f2.myCar();
		
		System.out.println("*******************************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g3 = new Father(12.34);// home but car , bike will not be visible/accessible to father
		g3.myHome();	
	}
}
