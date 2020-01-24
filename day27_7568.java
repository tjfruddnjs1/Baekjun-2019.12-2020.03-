import java.util.Scanner;

public class day27_7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[][] physical = new int[input][2];
		int[] rank = new int[input];
		
		for(int i=0;i<input;i++) {
			rank[i] = 1;
			physical[i][0] = scan.nextInt();
			physical[i][1] = scan.nextInt();
		}
		
		for(int i=0;i<input;i++) {
			for(int j=0;j<input;j++) {
				if(physical[i][0]>physical[j][0] && physical[i][1] > physical[j][1]) {
					rank[j] ++;
				}
			}
		}
		
		for(int i=0;i<input;i++) {
			System.out.print(rank[i]+" ");
		}
		
	}

}
