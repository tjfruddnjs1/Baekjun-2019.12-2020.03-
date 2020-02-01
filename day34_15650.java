import java.util.Scanner;

public class day34_15650 {		
		private static int[] num;
		private static boolean[] visited;
		private static StringBuilder sb =new StringBuilder();
		private static int N,M;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		num = new int[N+1];
		visited = new boolean[N+1];
		backtrack(0,1);
		System.out.print(sb);
	}
	private static void backtrack(int count,int current) { //오름차순을 위한 current
		if(count == M) {
			for(int i=0;i<M;i++) sb.append(num[i]+" ");
			sb.append("\n");
			return;
		}
		for(int i=current;i<=N;i++) { //i=1 → i=current
			if(!visited[i]) {
				visited[i] = true;
				num[count] = i;
				backtrack(count+1,i+1); // i+1
				visited[i] = false;
			}
		}
	}
}