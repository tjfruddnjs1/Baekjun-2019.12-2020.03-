import java.util.Scanner;

public class day45_1932 {

	static int input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		int sum = 0;
		int[][] arr = new int[input+1][input+1];
		
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				arr[i][j] = scan.nextInt();
				
				if(j==1) arr[i][j] = arr[i-1][j] + arr[i][j];
				else if(j==i) arr[i][j] = arr[i-1][j-1] + arr[i][j];
				else arr[i][j] = Math.max(arr[i-1][j-1], arr[i-1][j]) + arr[i][j];
				
				if(sum < arr[i][j]) sum = arr[i][j];
			}
		}
		
		System.out.println(sum);
		
		
	}

}
