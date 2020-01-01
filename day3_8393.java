import java.util.Scanner;

public class day3_8393 {
	public static void main(String[] args) {
		int N = new Scanner(System.in).nextInt();
		int result = 0;
		
		for(int i=1;i<=N;i++) {
			result += i;
		}
		
		System.out.println(result);
	}
}
