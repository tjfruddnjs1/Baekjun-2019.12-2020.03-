import java.util.Scanner;

public class day49_11054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int[][] dp = new int[input][3]; //1:num,2:<,3:>
		int max = 1;
		
		for(int i=0;i<input;i++) {
			int tmp = scan.nextInt();
			dp[i][0] = tmp;
			dp[i][1] = 1;
			dp[i][2] = 1;
			for(int j=0;j<i;j++) {
				if(dp[j][0] < tmp) {
					dp[i][1] = Math.max(dp[i][1], dp[j][1]+1);
				}
				
				if(dp[j][0] > tmp) {
					dp[i][2] = Math.max(dp[i][2], dp[j][2]+1);
					dp[i][2] = Math.max(dp[i][2], dp[j][1]+1);
				}
			}
			
			max = Math.max(max, Math.max(dp[i][2], dp[i][1]));
		}
		System.out.println(max);
	}

}
