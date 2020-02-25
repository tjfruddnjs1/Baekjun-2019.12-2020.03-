import java.util.Arrays;
import java.util.Scanner;

public class day59_1037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] numArr = new int[input];
		
		for(int i=0;i<input;i++) {
			numArr[i] = scan.nextInt();
		}
		
		Arrays.sort(numArr);
		
		System.out.println(numArr[0] * numArr[input-1]);
	}

}
