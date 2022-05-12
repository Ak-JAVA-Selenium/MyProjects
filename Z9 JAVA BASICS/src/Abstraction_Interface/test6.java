package Abstraction_Interface;
/**
 * Since Java 8,we can have default & static method in interface.
 * ---------- 9,----------- private method in an interface.
 */
interface Drawable2 {
	void draw();// by default public abstract

	default void msg() {
		System.out.println("default method");
	}

	static int cube(int x) {
		return x * x * x;
	}
//	default static int print(){ // default static can't be written together
//		System.out.println("default static method of interface");
//	}  
}

class Rectangle2 implements Drawable2 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

public class test6 {

	public static void main(String[] args) {

		Drawable2 d = new Rectangle2();
		d.draw();
		d.msg();
		System.out.println(Drawable2.cube(3));
	}
}
