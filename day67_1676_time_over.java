import java.util.Scanner;

public class day67_1676_time_over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] factorial = new int[input+1];
		
		factorial[1] = 1;
		for(int i=2;i<=input;i++) {
			factorial[i] = factorial[i-1] * i ;
		}
		
		int count = 0;
		while(true) {
			if(factorial[input] % 10 != 0) break;
			else {
				factorial[input] /= 10;
				count++;
			}
		}
		
		System.out.println(count);
	}

}
