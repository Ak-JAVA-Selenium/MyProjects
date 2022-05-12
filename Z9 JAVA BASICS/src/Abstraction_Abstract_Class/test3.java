package Abstraction_Abstract_Class;

abstract class RBIBank {
	abstract double getRateOfInterestForHomeLoan();

	final void loan() {
		System.out.println("As per RBI loan..");
	}
}

class SBI101 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}

class PNB extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 7.5;
	}
}

public class test3 {

	public static void main(String[] args) {

		PNB p1 = new PNB();
		System.out.println("PNB Rate of Interest is: " + p1.getRateOfInterestForHomeLoan() + " %");
		p1.loan();
		System.out.println("=======================================");

		SBI101 s1 = new SBI101();
		System.out.println("SBI Rate of Interest is: " + s1.getRateOfInterestForHomeLoan() + " %");
		s1.loan();
		System.out.println("=======================================");

		RBIBank b1 = new SBI101();
		System.out.println(
				"RBI reference but object of SBI,\nRate of Interest is: " + b1.getRateOfInterestForHomeLoan() + " %");
		System.out.println("=======================================");
		
		RBIBank b2 = new PNB();
		System.out.println(
				"RBI reference but object of PNB,\nRate of Interest is: " + b2.getRateOfInterestForHomeLoan() + " %");
	}
}
