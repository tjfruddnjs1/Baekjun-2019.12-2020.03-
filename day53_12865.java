import java.util.Scanner;

public class day53_12865 {
	static int count, maxWeight;
	static int dp[][], weight[], value[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		count = scan.nextInt();
		maxWeight = scan.nextInt();

		dp = new int[count + 1][maxWeight + 1];
		weight = new int[count + 1];
		value = new int[count + 1];

		for (int i = 1; i <= count; i++) {
			weight[i] = scan.nextInt();
			value[i] = scan.nextInt();
		}

		for (int i = 1; i <= count; i++) {
			for(int j=1;j<=maxWeight;j++) {
				dp[i][j] = dp[i-1][j];
				if(j-weight[i]>=0) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]]+value[i]);
				}
			}
		}
		
		System.out.println(dp[count][maxWeight]);
	}

}
