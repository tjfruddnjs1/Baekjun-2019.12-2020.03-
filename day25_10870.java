import java.util.Scanner;

public class day25_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum = 0;
		System.out.println(pvonachi(input,sum));
		
	}

	private static int pvonachi(int n,int sum) {
		if(n<2) {
			sum+=n;
		}else if(n>=2) {
			sum += pvonachi(n-1,sum) + pvonachi(n-2,sum);
		}
		return sum;
	}
}
