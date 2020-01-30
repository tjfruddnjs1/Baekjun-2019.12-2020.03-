import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class day33_10814 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine().trim());
		String[][] name = new String[input][2];
		String[] str = new String[2];
		
		for(int i=0;i<input;i++) {
			str = br.readLine().split(" ");
			name[i][0] = str[0];
			name[i][1] = str[1];
		}
		
		Arrays.sort(name, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
				//나이순으로만 정렬하면 정렬완료, 이미 배열에 순서대로 저장
			}
			
		});
		
		for(int i=0;i<input;i++) {
			System.out.println(name[i][0] + " " + name[i][1]);
		}
	}

}
