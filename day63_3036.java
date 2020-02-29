import java.util.Scanner;

public class day63_3036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] num = new int[input];
		
		for(int i=0;i<input;i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i=1;i<input;i++) {
			if(num[0]%num[i] == 0) {
				num[i] = num[0]/num[i];
				System.out.println(num[i]+"/1");
			}else {
				int gcd = getGCD(num[0],num[i]);
				System.out.println(num[0]/gcd+"/"+num[i]/gcd);
			}
		}
		
	}
	
	private static int getGCD(int a, int b) {
		while(b != 0) {
			int tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}

}
