
public class day61_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int gcd = getGCD(Math.max(a, b),Math.min(a, b));
		int lcm = getLCM(a,b,gcd);
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}
	private static int getGCD(int a, int b) {
		/* 
		 * 유클리드 호제법, 
		 * 1. A % B = R
		 * 2. if R == 0, GCD is B
		 * 3. else if R != 0, 2번 과정 반복 
		 * */
		while(b>0) {
			int tmp = a;
			a = b;
			b = tmp % b;
		}
		
		return a;
	}
	
	private static int getLCM(int a, int b, int gcd) {
		return (a*b)/gcd;
	}

}
