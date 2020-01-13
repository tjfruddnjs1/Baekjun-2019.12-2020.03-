import java.util.Scanner;

public class day16_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(beeHouse(N));
	}
	
	private static int beeHouse(int input) {
		if(input == 1) return 1;
		int i=2;
		int result = 1;
		
		while(i<=input) {
			i += 6*result++;
		}
		
		return result;
	}

}
