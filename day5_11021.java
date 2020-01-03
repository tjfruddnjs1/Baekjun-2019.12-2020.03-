import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class day5_11021  {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i=1;i<=n;i++) {
			String text = br.readLine();
			String[] word = text.split(" ");
			
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write("Case #"+i+": "+(a+b)+"\n");

		}
		bw.flush();
		bw.close();
				
	}

}
