import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class day5_2438 {

	public static void main(String[] args)throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i=0;i<n;i++) {
			for(int j=n-i; j<=n ; j++) {
			bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}

}
