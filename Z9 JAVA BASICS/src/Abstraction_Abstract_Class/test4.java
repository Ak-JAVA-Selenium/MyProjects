package Abstraction_Abstract_Class;

abstract class RBIBank102 {
	
	// final abstract double getRateOfInterestForHomeLoan();
	
	// Abstract mean must be overridden
	// final means can't be override
	
	abstract double getRateOfInterestForHomeLoan();
}

class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}

public class test4 {

	public static void main(String[] args) {

		SBI102 ref = new SBI102();
		System.out.println(ref.getRateOfInterestForHomeLoan());
		
		RBIBank ref2 = new SBI102();
		System.out.println(ref2.getRateOfInterestForHomeLoan());
	}
}
