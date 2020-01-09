import java.util.Scanner;

public class day12_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		int[] whereAlpha = new int[26];
		int i = 0;
		
		for(i=0;i<26;i++) {
			whereAlpha[i] = -1;
		}
		
		for(i=0;i<input.length();i++) {
			int tmp = input.charAt(i) - 97;
			
			if(whereAlpha[tmp] != -1) {
			whereAlpha[tmp] -= (i+1);	
			}
			
			whereAlpha[tmp] += (i+1);
		}
		
		for(i=0;i<26;i++) {
			System.out.print(whereAlpha[i]+" ");
		}
		
		
		scan.close();
		
	}

}
