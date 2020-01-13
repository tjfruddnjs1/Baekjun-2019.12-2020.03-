import java.util.Scanner;

public class day16_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		if(input%5 == 0) System.out.println(input/5);
		else if(input%5 != 0) {
			int result1 = input/5;
			input %= 5;
			if(input%3 == 0) {
				int result2 = input/3;
				System.out.println(result1 + result2);
			}
			else System.out.println(-1);
		}
//		input/3 = 6 , X
//		next
//		input/5 = 3
//		input - 5*3 / 3 = 4, Y
//		X>Y  print Y
//		else print X
	}

}
