import java.util.Scanner;

public class day2_10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if(A>=B) {
		 if(B>=C) System.out.println(B);
		 else if(B<=C) {
			 if(A>=C) System.out.println(C);
			 else System.out.println(A);
		 }
		}
		else if (A<=B) {
			if(B>=C) {
				if(A>=C) System.out.println(A);
				else System.out.println(C);
			}
            else if(B<=C) System.out.println(B);
		}
	}

}
