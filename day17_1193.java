import java.util.Scanner;

public class day17_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum = 0;
		int cnt = 0;
		int frontNum = 0;
		int endNum = 0;
		int tmp = 1;
		
		while(sum<input) {
			cnt++;
			sum += cnt;
		}
		
		if(cnt%2 == 1) {
			sum -= (cnt-1);
			frontNum = cnt;
			endNum = tmp;
			while(sum != input) {
				frontNum--;
				endNum++;
				sum++;
			}
		}else if(cnt%2 == 0) {
			sum -= (cnt-1);
			frontNum = tmp;
			endNum = cnt;
			while(sum != input) {
				frontNum++;
				endNum--;
				sum++;
			}
		}
		System.out.println(frontNum +"/"+ endNum);
//		1/1					1
//		1/2 2/1				2
//		3/1 2/2 1/3			3
//		1/4 2/3 3/2 4/1		4
//		5/1 4/2 3/3 2/4 1/5	5
	}

}
