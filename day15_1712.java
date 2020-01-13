import java.util.Scanner;

public class day15_1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int result =0;
		
		if(B>C) result = -1;
		else result = A/(C-B) + 1;
		
		System.out.println(result);
		scan.close();
	}

}
