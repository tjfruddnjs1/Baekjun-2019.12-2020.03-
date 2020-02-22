import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class day55_1931 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] time = new int[N][2];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			for(int j=0;j<2;j++) {
				time[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) return o1[0]-o2[0];
				else return o1[1]-o2[1];
			}
			
		});
		
		int end = -1;
		int count = 0;
		
		for(int i=0;i<N;i++) {
			if(time[i][0]>=end) {
				end = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
