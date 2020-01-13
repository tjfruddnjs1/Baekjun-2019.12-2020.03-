import java.util.Scanner;

public class day15_1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int answer = N;
		
		for(int i=0;i<N;i++) {
			String word = scan.next();
			boolean[] alpha = new boolean[26];
			
			for(int j=1;j<word.length();j++) {
				if(word.charAt(j-1) != word.charAt(j)) {
					if(alpha[word.charAt(j)-97] == true) {
						answer --;
						break;
					}
					alpha[word.charAt(i-1) - 97] =true;
				}
			}
		}
		System.out.println(answer);
	}

}
