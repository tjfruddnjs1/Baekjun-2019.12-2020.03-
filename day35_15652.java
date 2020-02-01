import java.util.Scanner;

public class day35_15652 {		
		private static int[] num;
		private static StringBuilder sb =new StringBuilder();
		private static int N,M;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		num = new int[N+1];
		backtrack(0);
		System.out.print(sb);
	}
	private static void backtrack(int count) { 
		if(count == M) {
			for(int i=0;i<M;i++) sb.append(num[i]+" ");
			sb.append("\n");
			return;
		}
		for(int i=1;i<=N;i++) {
			if(count!=0 && num[count-1]>i) continue;
				num[count] = i;
				backtrack(count+1);
		}
	}
}