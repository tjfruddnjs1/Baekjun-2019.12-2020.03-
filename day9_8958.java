import java.util.Scanner;

public class day9_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int sum;
		int count;
		String[] arr = new String[A];
		for(int i=0;i< A;i++) {
			arr[i] = scan.next();
		}
		for(String OXscore : arr) {
			count = 0;
			sum = 0;
			for(int i=0;i<OXscore.length();i++) {
				if(OXscore.charAt(i) == 'O') {
					sum += count++;
				}else {
					count = 0;
				}
			}
			System.out.println(sum);
		}
		
		
		
	}

}
