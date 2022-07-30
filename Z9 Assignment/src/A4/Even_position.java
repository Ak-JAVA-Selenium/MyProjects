package A4;

public class Even_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = new int[10];
		
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		arr[5]=5;
		arr[6]=6;
		arr[7]=7;
		arr[8]=8;
		arr[9]=9;
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
