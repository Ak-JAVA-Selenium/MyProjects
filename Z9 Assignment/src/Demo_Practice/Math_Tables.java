package Demo_Practice;

public class Math_Tables {

	public static void main(String[] args) {

		int x, i, j;

		for (i = 1; i <= 10; i++) {
			
			for (j = 1; j <= 10; j++) {
				
				x = i * j;
				
				if (x < 10) {
					
					System.out.print(x + "  |  ");
					
				} else if (x > 9 && x < 99) {
					
					System.out.print(x + " |  ");
					
				} else {
					
					System.out.println(x + "|");
				}
			}
			System.out.println();
		}
	}
}
