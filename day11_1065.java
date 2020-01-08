import java.util.Scanner;

public class day11_1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = numOfArr(n);
		System.out.println(result);
	}
	
	private static int numOfArr(int n) {
		int cnt = 0;
		for(int i=1; i<=n ; i++) {
			if(i/10 == 0) {
				cnt++;
			}else if(i/100 == 0) {
				cnt++;
			}else if(i/1000 == 0) {
				if(i/100 - (i/10 - (i/100) * 10) == 
						(i/10 - (i/100) * 10) - i%10) cnt++;
			}
		}
		return cnt; 
	}

}
