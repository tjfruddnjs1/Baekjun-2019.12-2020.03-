import java.util.Scanner;

public class day65_11051 {
	/*
	 * 			1							(0,0)
	 * 		1		1					(1,0)	(1,1)
	 * 	1		2		1			(2,0)	(2,1)	(2,2)
	 * 1	3		3		1	(3,0)	(3,1)	(3,2)	(3,3)	...
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int[][] pascal = new int[a+1][a+1];
		
		for(int i=0;i<pascal.length;i++) {
			for(int j=0;j<=i;j++) {
				if(i==j || j==0) pascal[i][j]=1;
				else pascal[i][j] = (pascal[i-1][j-1]+pascal[i-1][j]) % 10007;
			}
		}
		
		System.out.println(pascal[a][b]);
	}

}
