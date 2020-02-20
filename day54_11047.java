import java.util.Scanner;

public class day54_11047 {
	
	private static int N ;
	private static int K ;
	private static int[] dp;
	private static int sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		K = scan.nextInt();
		dp = new int[N+1];
		sum = 0;
		
		for(int i=1;i<=N;i++) {
			dp[i] = scan.nextInt();
		}
		
		for(int i=N;i>=1;i--) {
			if(K/dp[i] != 0) {
				sum += K/dp[i];
				K -= (K/dp[i]) * dp[i];
			}else continue;
		}
		
		System.out.println(sum);
	}

	/*
	 * private static void kindOfMoney(int input) { int[] arr = new int[input+1];
	 * int count = 0; for(int i=0;i<input/2;i++) { arr[count] = 1 *
	 * (int)Math.pow(10, i); arr[count+1] = 5 * (int)Math.pow(10, i); count+=2; }
	 * 
	 * for(int i=0;i<input;i++) { System.out.println(arr[i]); } }
	 */
}
