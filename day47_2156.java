import java.util.Scanner;

public class day47_2156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] dp = new int[input];
		int[] tmp = new int[input];
		
		for(int i=0;i<input;i++) {
			tmp[i] = scan.nextInt();
		}
		
		//1,2,3 일 경우
		if(input >= 1) dp[0] = tmp[0];
		
		if(input >= 2) dp[1] = tmp[0] + tmp[1];
		
		if(input >= 3) dp[2] = Math.max(dp[1], Math.max(dp[0]+tmp[2], tmp[1]+tmp[2]));
		
		// XOO OXO OOX 의 경우
		for(int i=3;i<input;i++) {
			dp[i] = Math.max(dp[i-3]+tmp[i-1]+tmp[i],Math.max(dp[i-2]+tmp[i], dp[i-1]));
		}
		
		System.out.println(dp[input-1]);
	}

}
