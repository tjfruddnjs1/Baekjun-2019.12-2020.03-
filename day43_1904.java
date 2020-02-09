import java.util.ArrayList;
import java.util.Scanner;

public class day43_1904 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		long[] dp = new long[input+1];
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3;i<=input;i++) {
			dp[i] = (dp[i-2] + dp[i-1]) % 15746;
		}
		
		System.out.println(dp[input]);
		
	}

}
