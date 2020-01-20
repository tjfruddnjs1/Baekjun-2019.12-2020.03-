import java.util.Scanner;

public class day23_3053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		
		String result1 = String.format("%.6f", Math.PI * r * r);
		String result2 = String.format("%.6f",(double) 2 * r * r);
		
		System.out.println(result1);
		System.out.println(result2);
	}

}

