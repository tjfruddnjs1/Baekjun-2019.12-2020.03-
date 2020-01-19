import java.util.Scanner;

public class day22_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int W = scan.nextInt();
		int H = scan.nextInt();
		int minX = 1001;
		int minY = 1001;
		
		if(W-X > X) {
			minX = X;	
		}else minX = W-X;
		if(H-Y > Y) {
			minY = Y;
		}else minY = H-Y;
		if(minX>minY) System.out.println(minY);
		else System.out.println(minX);
		
	}
 
}
