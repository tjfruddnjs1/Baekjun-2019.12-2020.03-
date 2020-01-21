import java.util.Scanner;

public class day24_1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int res[] = new int[input];
		for(int i=0;i<input;i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int r1 = scan.nextInt();
			
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			int r2 = scan.nextInt();
			res[i] = method(x1,y1,r1,x2,y2,r2);
		}
		
		for(int i=0;i<input;i++) {
			System.out.println(res[i]);
		}
		
	}
	
	private static int method(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		double r = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		if(x1==x2 && y1==y2 && r1==r2) 
			return -1;
		else if(r>r1+r2 || x1==x2 && y1==y2 && r1!=r2 || r <Math.abs(r1-r2)) 
			return 0;
		else if (r == r1+r2 || Math.abs(r1-r2) == r) 
			return 1;
		else 
			return 2;
	}
	

}
