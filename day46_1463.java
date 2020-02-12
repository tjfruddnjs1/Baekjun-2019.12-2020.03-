import java.util.Scanner;

public class day46_1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] cnt = new int[input+1];
		
		cnt[1] = 0;
		for(int i=2;i<=input;i++) {
			cnt[i] = cnt[i-1]+1;
			if(i%2 == 0) cnt[i] = Math.min(cnt[i], cnt[i/2]+1);
			if(i%3 == 0) cnt[i] = Math.min(cnt[i], cnt[i/3]+1);
		}
		
		System.out.println(cnt[input]);
		
	}

}
