import java.util.Scanner;

public class day12_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		input = input.toLowerCase();
		int[] alpha = new int[26];
		int max = 0;
		int i;
		for(i=0;i<alpha.length;i++) {
			alpha[i] = -5;
		}
		
		for(i=0;i<input.length();i++) {
			int tmp = input.charAt(i) - 97;
			alpha[tmp]++;
		}
		
		for(i=0;i<alpha.length;i++) {
			if(max<alpha[i]) max = alpha[i];
		}
		
		System.out.println((char)(max+97));
	}

}
