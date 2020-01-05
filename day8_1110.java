import java.util.Scanner;

public class day8_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] arr = new int[2];
		int cnt = 0;
		int sum;
		int temp;
		arr[0] = input/10;
		arr[1] = input%10;
		
		
		while(true) {	
			sum = arr[0] + arr[1];
			temp = (arr[1] * 10) + (sum%10);
			cnt++;
			
			if(temp < 10) {
				arr[0] = 0;
				arr[1] = temp;	
			}
			else {
				arr[0] = temp/10;
				arr[1] = temp%10;
			}
			
			if(temp == input) {
				System.out.println(cnt);
				break;
			}
		}
		
	}

}
