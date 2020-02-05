import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day38_14889 {
	
	static int stoi(String s) {
		return Integer.parseInt(s);
	}
	
	static int N;
	static boolean[] visited;
	static int[][] arr;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = stoi(br.readLine());
		visited = new boolean[N+1];
		arr = new int[N+1][N+1];
		
		for(int i=1;i<N+1;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<N+1;j++) {
				arr[i][j] = stoi(st.nextToken());
			}
		}
		
		backtrack(1,0);
		System.out.println(min);
	}
	
	static void backtrack(int start,int index) {
		if(index == N/2) {
			min = Math.min(min, getAbilityDifference());
			return;
		}
		
		for(int i=start;i<N+1;i++) {
			if(visited[i] != true) {
				visited[i] = true;
				backtrack(i+1,index+1);
				visited[i] = false;
			}
		}
	}
	
	static int getAbilityDifference() {
		int sumStart = 0;
		int sumLink = 0;
		
		for(int i=1;i<N+1;i++) {
			for(int j=1;j<N+1;j++) {
				//true : startÆÀ
				if(visited[i] && visited[j]) sumStart += arr[i][j];
				//false : linkÆÀ
				if(visited[i] != true && visited[j] != true) sumLink +=arr[i][j];
			}
		}
		
		return Math.abs(sumStart - sumLink);
	}

}
