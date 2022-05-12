package Casting_NonPrimitive_Up_Down;

class Member {
	long phone;

	void chat() {
		System.out.println("chatting in whatsapp group with " + phone);
	}
}

class Admin extends Member {
	void addNumber() {
		System.out.println("adding a new user number in whatsapp group");
	}
}

public class test4 {

	public static void main(String[] args) {

		Member mem = new Admin();
		mem.phone = 9876543210l;
		System.out.println(mem.phone);
		mem.chat();
		System.out.println("********** After downcasting ************");
		Admin ad = (Admin) mem; // Downcast to access specific property of subclass
		ad.addNumber();
		ad.chat();
		System.out.println(ad.phone);

		// Admin a1=new Member();//direct downcasting, invalid or not possible
	}
}
/**
 * child class object referred by any of its parent known as up casting
 * 
 * parent class object referred by any of its child class known as downcasting
 * directly downcasting is not possible in java
 * 
 * Child c2=new Parent();//downcasting but not possible in this way
 * 
 * Parent p1=new Child();
 * 
 * Child c1=(Child)p1;//downcasting, as Upcasting object is getting down casted here
 */