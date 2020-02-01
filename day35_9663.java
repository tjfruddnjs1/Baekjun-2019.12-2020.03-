import java.util.Scanner;

public class day35_9663{		
		private static int count;
		private static int N;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		for(int i=1;i<=N;i++) {
			int[] col = new int[N+1];
			col[1] = i;
			backtrack(col,1);
		}
		
		System.out.print(count);
	}
	private static void backtrack(int[] col, int row) { 
		if(row == N) {
			count++;
			//퀸을 전부 놓았을 경우
		}else {
			for(int i=1;i<=N;i++) {
				col[row+1] = i;
				if(isPossible(col,row+1)) {
					backtrack(col,row+1);
					//다음 열에 퀸을 놓을수 있는 경우
				}
			}
		}
	}
	
	private static boolean isPossible(int[] col,int row) {
		for(int i=1;i<row;i++) {
			if(col[i] == col[row]) return false;
			//같은 열
			if(Math.abs(i-row) == Math.abs(col[i]-col[row])) return false;
			//대각선 상의 Queen
		}
		return true;
	}
}