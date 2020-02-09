import java.util.Scanner;

public class day43_9461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		for (int i = 0; i < input; i++) {			
			int cycle = scan.nextInt();			
			long[] dp = new long[101];
			
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;

			for (int j = 4; j <= cycle; j++) {
				dp[j] = dp[j - 3] + dp[j - 2];
			}
			System.out.println(dp[cycle]);
		}	
		scan.close();
	}
}
