import java.util.Scanner;

public class day22_3309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int squareX[] = new int[1001];
		int squareY[] = new int[1001];
		
		for(int i=0;i<3;i++) {
			squareX[scan.nextInt()]++;
			squareY[scan.nextInt()]++;
		}
		
		for(int i=1;i<1001;i++) {
			if(squareX[i] % 2 ==1) System.out.printf(i + " ");
		}
		for(int i=1;i<1001;i++) {
			if(squareY[i] % 2 ==1) System.out.println(i);
		}
		
		
	}

}

