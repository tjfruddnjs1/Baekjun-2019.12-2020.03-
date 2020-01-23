import java.util.Scanner;

public class day26_11729 {
	
	public static int answer = 0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		hanoi(input,1,2,3);
		sb.insert(0, answer+"\n");
		System.out.println(sb);
	}
	
	private static void hanoi(int input,int from, int by,int to) {
		answer++;
		
		if(input == 1) sb.append(from+" "+to+"\n");
		else {
			hanoi(input-1,from,to,by);	//1¡æ2
			sb.append(from+" "+to+"\n");//1¡æ3
			hanoi(input-1,by,from,to);	//2¡æ3
		}
	}
}
