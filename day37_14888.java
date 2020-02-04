import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day37_14888 {
		static int[] arr;	//숫자
		static int[] op;	//연산자 횟수
		static ArrayList<Integer> list; //최소&최대 찾기 위한 모든 값 저장
		static int N;
		static int count = 0;
		static char[] seeOp;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		arr = new int[N];
		op = new int[4];
		seeOp = new char[N];
		
		list = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) arr[i] = scan.nextInt();
		
		for(int i=0;i<4;i++) op[i] = scan.nextInt();
		
		backtrack(1,arr[0]);
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(0));
		
	}
	
	static void backtrack(int x, int sum) {
		for (int i=0;i<4;i++) {
			if(op[i] != 0) {
				op[i]--;
				switch(i) {
				case 0:
					seeOp[x-1] = '+';
					backtrack(x+1,sum+arr[x]);
					break;
				case 1:
					seeOp[x-1] = '-';
					backtrack(x+1,sum-arr[x]);
					break;
				case 2:
					seeOp[x-1] = '*';
					backtrack(x+1,sum*arr[x]);
					break;
				case 3:
					seeOp[x-1] = '/';
					backtrack(x+1,sum/arr[x]);
					break;
				}
				seeOp[x-1] = 0;
				op[i]++;
			}
		}
		
		if(x == N) {
			for(int i=0;i<N;i++) {
				System.out.print(arr[i] + " ");
				System.out.print(seeOp[i]+ " ");
			}
			System.out.println("=" + sum);
			list.add(sum);
		}
	}

}
