package Encapsulation_GetSet_Method;

class Demo {
	private int empID = 1000;
	private double salary = 45000;

	// getter methods
	public int getEmpID() {
		return empID;
	}

	public double getSalary() {
		return salary;
	}

	// setter methods
	public void setEmpID(int id) {
		empID = id;
	}

	public void setSalary(double sal) {
		salary = sal;
	}
}

public class test {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		// System.out.println(d1.empID);// compile time error
		// System.out.println(d1.salary);// compile time error
		System.out.println(d1.getEmpID());
		System.out.println(d1.getSalary());
		// salary + bonus
		double updatedSalary = d1.getSalary() + 14000;
		System.out.println("Updated salary: " + updatedSalary);
		System.out.println(d1.getSalary());
		System.out.println("********************************");
		d1.setEmpID(1223);
		d1.setSalary(55000);
		System.out.println(d1.getEmpID());
		System.out.println(d1.getSalary());
	}
}
/**
 * In order to access private variable outside the class we need implement getter method
 * 		--> getter method--> helps to access private variable from outside the class
 * 				--> declared with public 
 * 				--> return type of this method should be same as private variable
 * 				--> it should return private variable
 * In order to modify private variable outside the class we need implement setter method
 * 		--> setter method--> helps to modify private variable from outside the class
 * 				--> declared with public 
 * 				--> return type of this method is void but parameter should be same as private variable
 * 
 * 
**/
