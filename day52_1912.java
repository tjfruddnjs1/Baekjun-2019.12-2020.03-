import java.io.BufferedReader;
import java.io.InputStreamReader;

public class day52_1912 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] arr = new int[input];
		int[] dp = new int[input];
		int max;
		for(int i=0;i<input;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		dp[0] = arr[0];
		max = arr[0];
		for(int i=1;i<input;i++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
			
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
