import java.util.Scanner;

public class day45_2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int dp[] = new int[input+1];
		int step[] = new int [input+1];
		
		for(int i=1;i<=input;i++) {
			step[i] = scan.nextInt();
		}
		
		dp[1] = step[1];
		dp[2] = dp[1] + step[2];
		
		for(int i=3;i<=input;i++) {
			dp[i] = Math.max(dp[i-2]+step[i], dp[i-3]+step[i-1]+step[i]);
		}
		
		System.out.println(dp[input]);
	}

}
