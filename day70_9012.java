import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

	/*
	 * '(' 만을 stack에 담는다
	 */

public class day70_9012 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		while(testCase-- >0) { //testCase--  >   0
			boolean isVPS = true;
			String input = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			
			for(int i=0;i<input.length();i++) {
				char tmp = input.charAt(i);
				
				if(tmp == '(') stack.push(tmp);
				else if(tmp == ')') {
					if(!stack.isEmpty()) {
						stack.pop();
					}else {
						isVPS = false;
						break;
					}
				}
			}
			
			if(!stack.isEmpty()) isVPS = false;
			
			if(isVPS) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
