import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class day39_1003 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine().trim());
		int [][] pvonachi = new int[41][2];
		pvonachi[0][0] = 1;
		pvonachi[1][1] = 1;
		for(int i=2;i<41;i++) {
			for(int j=0;j<2;j++) {
				pvonachi[i][j] = pvonachi[i-1][j] + pvonachi[i-2][j];
			}
		}
		
		for(int i=0;i<input;i++) {
			int num = Integer.parseInt(br.readLine().trim());
			System.out.println(pvonachi[num][0]+" "+pvonachi[num][1]);
		}
		
		bw.flush();
	}

}
