package If_Else_Statements;
											// Nested If statement........
public class test1 {

	public static void main(String[] args) {

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
