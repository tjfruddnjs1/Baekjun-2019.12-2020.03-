import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class day71_4949 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			String input = br.readLine();
			
			if(input.equals(".")) {
				bw.flush();
				bw.close();
				return;
			}
			
			Stack<Character> stack = new Stack<>();
			boolean result = true;
			
			for(char tmp : input.toCharArray()) {
				if(tmp == '(' || tmp == '[') stack.push(tmp);
				else if(tmp == ')') {
					if(stack.isEmpty() || stack.pop() != '(') {
						result = false;
						break;
					}
				}else if(tmp == ']') {
					if(stack.isEmpty() || stack.pop() != '[') {
						result = false;
						break;
					}
				}
			}
			if(!stack.isEmpty()) result = false;
			if(result == false) bw.write("no\n");
			else bw.write("yes\n");
		}
	}

}
