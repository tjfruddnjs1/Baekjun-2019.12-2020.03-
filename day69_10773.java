import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class day69_10773 {
		
		static int tmp;
		static int i;
		static int sum;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<input;i++) {
			tmp = Integer.parseInt(br.readLine());
			
			if(tmp==0 && !stack.isEmpty()) {
				stack.pop();
			}
			else if(tmp != 0) {
				stack.push(tmp);
			}
		}
		
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}

}
