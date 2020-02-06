import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class day39_2748 {
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine().trim());
		long[] pvonachi = new long[91];
		pvonachi[0] = 0;
		pvonachi[1] = 1;
		
		for(int i=2;i<=input;i++) {
			pvonachi[i] = pvonachi[i-1] + pvonachi[i-2];
		}
		
		bw.write(String.valueOf(pvonachi[input]));
		bw.flush();
	}

}
