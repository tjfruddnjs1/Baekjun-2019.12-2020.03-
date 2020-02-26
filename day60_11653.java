import java.util.Scanner;

public class day60_11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int i =2;
		
		while(input>=i) {
			if(input % i == 0) {
				System.out.println(i);
				input /= i;
			}else {
				i++;
			}
		}
	}

}
