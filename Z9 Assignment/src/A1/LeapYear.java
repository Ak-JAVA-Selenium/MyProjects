package A1;

public class LeapYear {

	static void leap(int i) {

		if (i % 400 == 0) {
			System.out.println("This is leap year :" + i);
		} else {
			System.out.println("This is not leap year :" + i);
		}
	}
	static void leap1(int i) {

		if (i % 100 == 0 && i % 4 == 0) {
			System.out.println("This is leap year :" + i);
		} else {
			System.out.println("This is not leap year :" + i);
		}
	}
	public static void main(String[] args) {

		LeapYear.leap(2000);
		LeapYear.leap(2002);
		
		System.out.println("============================");
		
		LeapYear.leap1(2000);
		LeapYear.leap1(2002);
	}
}
