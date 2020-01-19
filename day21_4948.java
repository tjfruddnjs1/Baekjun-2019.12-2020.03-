import java.util.Scanner;

public class day21_4948 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = 1;
		int result;
		
		while(num != 0) {
		num = scan.nextInt();
		if(num == 0) break;
		result = 0;
		for (int i = num+1; i <= 2*num; i++) {
			
			for (int j = 2; j <= (int) Math.sqrt(i) + 1; j++) {
				if (i % j == 0) {
					result++;
					break;
				}
			}
		}
		result = num - result;
		if(num == 1) System.out.println(1);
		else System.out.println(result);
		}
	}

}