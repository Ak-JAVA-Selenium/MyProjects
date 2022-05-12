package All_Topic_Practice;
/**	
Constructor () {	default constructor written by java compiler at the time of compilation		}.....
Constructor is used to initialize instance members of the class,
constructor is similar to method but,
	1. constructor name should be same as classname
	2. constructor doesn't have return type and also not returns any value
	3. constructor gets called automatically when an instance/object of a class is created
	4. being a programmer we can't call/executed constructor based on our requirement
	5. constructor are 2 types ;
		a. default constructor : written by java compiler
		b. user defined constructor : written by programmer
			i. zero parameterized constructor
			ii. parameterized constructor		
**/
/*
* As we know anything declared with final keyword known as constant and...
* any variable declared with final keyword should initialize at the same time.
* But - we can declared Non-static global variable with final keyword and...
* should be initialize in constructor.
* (because non-static members load into memory when object created with help of constructor.)
*/
public class Constructor {

	int roll;
	double salary;
	final int speedlimit;

	Constructor(int r, double s) {
		roll = r;
		salary = s;
		speedlimit = 70;
		System.out.println("FNGV = "+speedlimit);
		System.out.println("roll & salary values are initialize in constructor");
		System.out.println("roll : " + r + "\tsalary : " + s);
	}

	public static void main(String[] args) {

		Constructor c1 = new Constructor(101, 25000);

		Constructor c2 = new Constructor(201, 55000);
	}
}
