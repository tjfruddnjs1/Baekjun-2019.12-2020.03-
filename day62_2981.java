import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

		/*
		 * num1 = aX + b
		 * num2 = a'X + b
		 * num3 = a''X + b
		 * 
		 * num1 - num2 = X(a-a') 
		 * num2 - num3 = X(a'-a'')
		 * 
		 * so, X's gcd is result.
		 */
public class day62_2981 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int[] num = new int[input];
		
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(num);
		
		int[] numGap = new int[input-1]; // 인접 원소간의 차이를 저장할 배열
		for(int i=0;i<input-1;i++) {
			numGap[i] = num[i+1] - num[i];
		}
		
		int gcd = 0; //최대공약수
		if(input-1>1) {
			gcd = getGCD(numGap[0],numGap[1]);
			for(int i=2;i<input-1;i++) {
				gcd = getGCD(gcd,numGap[i]);
			}
		}else {
			gcd = numGap[0];
		}
		
		Stack<Integer> st = new Stack<Integer>();
		st.add(gcd);
		
		for(int i=gcd-1;i>=2;i--) {
			if(gcd%i==0) st.add(i);
		}
		
		StringBuilder sb =new StringBuilder();
		while(!st.isEmpty()) {
			sb.append(st.pop() + " ");
		}
		
		System.out.println(sb);
	}
	
	//gcd
	private static int getGCD(int a, int b) {
		
		while(b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		
		return a;
	}

}
