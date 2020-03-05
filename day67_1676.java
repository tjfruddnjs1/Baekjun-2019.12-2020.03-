import java.util.Scanner;

public class day67_1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int tmp;
		int cnt_2 = 0;
		int cnt_5 = 0;
		
		for(int i=1;i<=input;i++) {
			tmp = i;
			while(tmp % 2 == 0 || tmp % 5 == 0) {
				if(tmp % 2 ==0) {
					tmp /=2;
					cnt_2++;
				}
				if(tmp % 5==0) {
					tmp /=5;
					cnt_5++;
				}
			}
		}
		
		System.out.println(Math.min(cnt_2, cnt_5));
	}

}
