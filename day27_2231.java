import java.util.Scanner;

public class day27_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int cnt = input;
		int result = 0;
		
		while(cnt >0) {
			cnt--;
			
			int sum = cnt;
			int tmp = cnt;
			while(tmp != 0) {
				sum += tmp%10;
				tmp/=10;
			}
			if(sum == input) result = cnt; 
		}
		
		System.out.println(result);
		
		
	}

}
