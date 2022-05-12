package All_Topic_Practice;
/**
 * 1. constructor should be private 
 * 2. create static ref variable of the class
 * 3. create static method which return current class object
 */
class singleT{
	
	// 1. constructor should be private
	private singleT() {
		System.out.println("Hi, Hello, Bye");
	}
	// 2. create static ref variable of the class
	static singleT ref = new singleT();
	
	int age=10;
	String tagline = "My Name is singleT Class";
	
	void display() {
		System.out.println("Display() of singleT class");
	}
	void display(int age) {
		System.out.println("Display() of singleT class & Age : "+age+"\tNGV Age : "+this.age);
	}
	// 3. create static method which return current class object
	static singleT getsingleT() {
		return ref;
	}
	static singleT getsingleT1() {
		singleT ref = new singleT();
		return ref;
	}
}
public class Singleton_Class {

	public static void main(String[] args) {

		// singleT s1=new singleT();
		// error as Singleton class constructor declared as private..can't load non-static member
		singleT s=singleT.getsingleT();
		System.out.println("NGV Age : "+singleT.getsingleT().age);
		System.out.println("====================");
		System.out.println("NGV Tagline : "+singleT.getsingleT().tagline);
		System.out.println("====================");
		singleT.getsingleT().display();
		System.out.println("====================");
		singleT.getsingleT().display(20);
		System.out.println("********************");
		System.out.println("NGV Age : "+singleT.getsingleT1().age);
		System.out.println("====================");
		System.out.println("NGV Tagline : "+singleT.getsingleT1().tagline);
		System.out.println("====================");
		singleT.getsingleT1().display();
		System.out.println("====================");
		singleT.getsingleT1().display(30);
		System.out.println("********************");
		
		singleT s2 = singleT.getsingleT();
		// indirect meaning---> singleT.getsingleT() ---> singleObj --->new singleT();
		
		System.out.println("NGV Age : "+s2.age);
		System.out.println("====================");
		System.out.println("NGV Tagline : "+s2.tagline);
		System.out.println("====================");
		s2.display();
		System.out.println("====================");
		s2.display(40);
		System.out.println("********************");
		
		System.out.println("**********After converting to upper case*********");
		System.out.println("NGV Tagline : "+s2.tagline.toUpperCase());
		
		System.out.println("**********After converting to lower case*********");
		System.out.println("NGV Tagline : "+s2.tagline.toLowerCase());
	}
}
