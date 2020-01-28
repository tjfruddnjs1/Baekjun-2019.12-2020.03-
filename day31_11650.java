import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class day31_11650 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine().trim());
		int[][] arr = new int[input][2];
		String[] str = new String[2];
		
		for(int i=0;i<input;i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		
		Arrays.sort(arr, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0]==o2[0]) return Integer.compare(o1[1], o2[1]);
				return Integer.compare(o1[0], o2[0]);
			}
			
		});
		
		for(int i=0;i<input;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		
	}

}
