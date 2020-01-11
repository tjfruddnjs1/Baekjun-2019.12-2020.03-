import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class day14_2941 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine().trim();
		int sum = 0;
		int i;
		for (i = 0; i < input.length(); i++) {
			sum++;
			switch (input.charAt(i)) {
			case 'c':
				if (i < input.length() - 1 && (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')) {
					i++;
				}
				break;
			case 'd':
				if (i < input.length() - 2 && input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=') {
					i += 2;
				} else if (i < input.length() - 1 && input.charAt(i + 1) == '-') {
					i++;
				}
				break;
			case 'l':
			case 'n':
				if (i < input.length() - 1 && input.charAt(i + 1) == 'j') {
					i++;
				}
				break;
			case 's':
			case 'z':
				if (i < input.length() - 1 && input.charAt(i + 1) == '=') {
					i++;
				}
				break;
			}

		}
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}

}
