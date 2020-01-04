import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Day7_10952 {

	public static void main(String[] args) throws IOException, NumberFormatException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = 3;
		int B = 3;
		
		while(A!= 0 && B!= 0) {	
			String text = br.readLine().trim();
			String[] word = text.split(" ");
			A = Integer.parseInt(word[0]);
			B = Integer.parseInt(word[1]);
			if(A!=0 && B!=0) { 
				bw.write(A + B +"\n");
			} 	
		}
		
		bw.flush();
		bw.close();
	}
	
	
}
