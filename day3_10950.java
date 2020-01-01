import java.util.Scanner;

public class day3_10950 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] input = new int[2][N];
		
		for(int i=0;i<N;i++) {
			input[0][i] = scan.nextInt();
			input[1][i] = scan.nextInt();
		}
		
		for(int i=0;i<N;i++) {
			System.out.print(input[0][i] + input[1][i]);
			System.out.println();
		}
	}
}
