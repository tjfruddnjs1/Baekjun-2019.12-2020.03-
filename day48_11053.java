import java.util.Scanner;

public class day48_11053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] numArr = new int[input];
		int[] numLength = new int[input];
		
		for(int i=0;i<input;i++) {
			numArr[i] = scan.nextInt();
			numLength[i] = 1;
		}
		
		for(int i=0;i<input;i++) {	
			for(int j=0;j<=i;j++) {
				if(numArr[i]>numArr[j] && numLength[i]<=numLength[j]) {
					numLength[i] = numLength[j]+1;
				}
			}
		}
		
		int max = 0;
		
		for(int i=0;i<input;i++) {
			if(numLength[i]>max) {
				max = numLength[i];
			}
		}
		
		System.out.println(max);
	}

}
