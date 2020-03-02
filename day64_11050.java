import java.util.Scanner;

public class day64_11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(factorial(a)/(factorial(a-b)*factorial(b)));
	}
	
	private static int factorial(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		return fac;
	}

}
