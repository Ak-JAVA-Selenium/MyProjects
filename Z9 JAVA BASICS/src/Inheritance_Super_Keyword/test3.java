package Inheritance_Super_Keyword;
										/** Assignment **/
class Company {
	int share, cost;

	Company() {
		this(11);
		share = 10;
		System.out.println(share);// 10
		System.out.println("Company cons...1 ");// ...1
		System.out.println(this.cost);// 0
		System.out.println(this.share + "\n");// 10
	}

	Company(int x) {
		this(11, 11.11);
		share = 20;
		System.out.println(share);// 20
		System.out.println("Company cons...2 " + x);// 11
		System.out.println(this.cost);// 0
		System.out.println(this.share + "\n");// 20
	}

	Company(int x, double y) {
		share = 30;
		System.out.println(share);// 30
		System.out.println("Company cons...3 " + x + " " + y);// 11, 11.11
		System.out.println(this.cost);// 0
		System.out.println(this.share + "\n");// 30
	}

	void display() {
		cost = 111;
		System.out.println(cost);
		System.out.println("Display method...1 ");
		this.display(0);
		System.out.println(this.cost);
		System.out.println(this.share + "\n");
	}

	void display(int a) {
		cost = 222;
		System.out.println(cost);
		System.out.println("Display method...2 " + a);
		this.display(0, 0.0);
		System.out.println(this.cost);
		System.out.println(this.share + "\n");
	}

	void display(int a, double b) {
		cost = 333;
		System.out.println(cost);
		System.out.println("Display method...3 " + a + " " + b);
		System.out.println(this.cost);
		System.out.println(this.share + "\n");
	}
}

class Employee extends Company {
	int share, cost;

	Employee() {
		super();
		cost = 10101;
		System.out.println(cost);// 10101
		System.out.println("Employee cons...1 ");// ...1
		System.out.println(this.cost);// 10101
		System.out.println(this.share + "\n");// 0
	}

	Employee(int x) {
		this();
		cost = 20202;
		System.out.println(cost);// 20202
		System.out.println("Employee cons...2 " + x);// 101
		System.out.println(this.cost);// 20202
		System.out.println(this.share + "\n");// 0
	}

	Employee(int x, double y) {
		this(101);
		cost = 30303;
		System.out.println(cost);// 30303
		System.out.println("Employee cons...3 " + x + " " + y);// 101, 101.101
		System.out.println(this.cost);// 30303
		System.out.println(this.share + "\n");// 0
	}

	void display() {
		share = 1000;
		System.out.println(cost);
		System.out.println("Display method...1 ");
		this.display(0);
		System.out.println(this.cost);
		System.out.println(this.share + "\n");
	}

	void display(int a) {
		share = 2000;
		System.out.println(cost);
		System.out.println("Display method...2 " + a);
		this.display(0, 0.0);
		System.out.println(this.cost);
		System.out.println(this.share + "\n");
	}

	void display(int a, double b) {
		share = 3000;
		System.out.println(cost);
		System.out.println("Display method...3 " + a + " " + b);
		System.out.println(this.cost);
		System.out.println(this.share + "\n");
	}

	void other() {
		super.display();
		System.out.println(super.share);
		System.out.println(super.cost);
		System.out.println(this.share);
		System.out.println(this.cost);
	}
}

public class test3 {

	public static void main(String[] args) {

		Employee ref = new Employee(101, 101.101);

		ref.display();
		System.out.println("=================================");

		ref.display(1);
		System.out.println("=================================");

		ref.display(1, 1.1);
		System.out.println("=================================");

		ref.display();
		System.out.println("=================================");

		ref.display(2);
		System.out.println("=================================");

		ref.display(2, 2.2);
		System.out.println("=================================");

		ref.other();
		System.out.println("=================================");

		Company ref2 = ref;

		ref2.display();
		System.out.println("=================================");

		ref2.display(1);
		System.out.println("=================================");

		ref2.display(1, 1.1);
		System.out.println("=================================");
	}
}
