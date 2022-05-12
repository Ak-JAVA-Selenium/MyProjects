package All_Topic_Practice;
/**
 * In order to access private variable outside the class we need implement getter method.
 * 		--> getter method--> helps to access private variable from outside the class.
 * 				--> declared with public 
 * 				--> return type of this method should be same as private variable
 * 				--> it should return private variable
 * In order to modify private variable outside the class we need implement setter method.
 * 		--> setter method--> helps to modify private variable from outside the class.
 * 				--> declared with public 
 * 				--> return type of this method is void but parameter should be same as private variable
**/
class GetSet {
	// private data members [private = restricted access]
	private long acc_no;
	private String name, email;
	private float amount;
	private int age = 25, salary = 1500;

	// getter methods
	public long getAcc_no() {
		return acc_no;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public float getAmount() {
		return amount;
	}

	// setter methods (also write)
	public void setAcc_no(long abc) {
		acc_no = abc;
	}

	public void setName(String xyz) {
		name = xyz;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	// Read only.....method
	public int ageReadonly() {
		return age;
	}

	// Write only.....method
	public void salaryWriteonly(int sal) {
		salary = sal;
	}
}

public class Encapsulation_GetSet_Method {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		GetSet acc = new GetSet();

		// setting values through setter methods
		acc.setAcc_no(1122334455);
		acc.setName("Akshay");
		acc.setEmail("akshay@gmail.com");
		acc.setAmount(222.4444f);

		// getting values through getter methods
		System.out.println("Get acc_no : " + acc.getAcc_no());
		System.out.println("Get name : " + acc.getName());
		System.out.println("Get email : " + acc.getEmail());
		System.out.println("Get amount : " + acc.getAmount());
		System.out.println("\nRead only method, age = " + acc.ageReadonly());
		acc.salaryWriteonly(20000);
	}
}
