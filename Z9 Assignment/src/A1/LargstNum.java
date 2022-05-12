package A1;

public class LargstNum {

	void largest(int num1, int num2, int num3) {

		System.out.println("Num1= " + num1 + "\nNum2 = " + num2 + "\nNum3 = " + num3);
		if (num1 > num2) {
			if (num2 > num3) {
				System.out.println(num1 + " is largest number");
			}
		}
		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println(num3 + " is largest number");
			} else {
				System.out.println(num2 + " is largest number");
			}
		}
	}

	public static void main(String[] args) {

		LargstNum ref = new LargstNum();

		ref.largest(25, 50, 75);
		System.out.println("========================");
		ref.largest(25, 75, 50);
		System.out.println("========================");
		ref.largest(75, 50, 25);
	}
}
