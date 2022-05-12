package All_Topic_Practice;

public class If_Else_Statement {

	public static void main(String[] args) {

		// If Else statement........
		int num1 = 75, num2 = 50;

		if (!(num1 == num2)) {
			System.out.println("Number1 is greater than numbers2");
		} else {
			System.out.println("Number1 is smaller than numbers2");
		}

		// if-else-if ladder statement........
		if (num1 == num2) {
			System.out.println("Number1 is equals to number2");
		} else if (num1 > num2) {
			System.out.println("Number1 is greater than numbers2");
		} else {
			System.out.println("Number1 is smaller than number2");
		}

		// Nested If statement........
		int age = 17;
		int weight = 51;

		if (age > 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood, as you weight is below 50");
			}
		} else {
			System.out.println("You are not eligible to donate blood, as you age is below 18");
		}
	}
}
