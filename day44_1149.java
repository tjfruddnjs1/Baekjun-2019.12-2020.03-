import java.util.Scanner;

public class day44_1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[][] dp = new int[input+1][3];
		for(int i=1;i<=input;i++) {
			dp[i][0] = scan.nextInt(); //red
			dp[i][1] = scan.nextInt(); //green
			dp[i][2] = scan.nextInt(); //blue
		}
		
		for(int i=2;i<=input;i++) {
			dp[i][0] += Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] += Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] += Math.min(dp[i-1][0], dp[i-1][1]);
		}
		
		System.out.println(Math.min(dp[input][0], Math.min(dp[input][1], dp[input][2])));
	}

}
