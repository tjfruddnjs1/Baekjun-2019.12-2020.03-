import java.util.Arrays;
import java.util.Scanner;

public class day56_11399 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum = 0;
		int[] value = new int[input+1];
		
		for(int i=1;i<=input;i++) {
			value[i] = scan.nextInt();
		}
		
		Arrays.sort(value);
		
		for(int i=1;i<=input;i++) {
			value[i] = value[i-1] + value[i];
			sum += value[i];
		}
		
		System.out.println(sum);
		scan.close();
		
	}

}
