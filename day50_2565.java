import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class day50_2565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int[] dp = new int[input+1];
		int[][] value = new int[input+1][2];
		
		for(int i=1;i<=input;i++) {
			for(int j=0;j<2;j++) {
				value[i][j] = scan.nextInt();
			}
		}
		
		Arrays.sort(value, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0]<o2[0]) return -1;
				else if(o1[0]>o2[0]) return 1;
				return 0;
			}
			
		});
		
		dp[1] = 1;
		
		for(int i=2;i<=input;i++) {
			dp[i] = 1;
			for(int j=1;j<i;j++) {
				if(value[i][1] > value[j][1]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=1;i<=input;i++) {
			if(dp[i]>max) max = dp[i];
		}
		
		System.out.println(input-max);
	}

}
