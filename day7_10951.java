import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Day7_10951 {

	public static void main(String[] args) throws IOException, NumberFormatException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = null;
		StringTokenizer st;
		int A,B;
		
		while((s=br.readLine()) != null && s.length() != 0) {	
			st = new StringTokenizer(s);
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			bw.write(A+B+"\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	
}
