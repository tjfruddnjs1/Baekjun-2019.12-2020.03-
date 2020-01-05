import java.util.Scanner;

public class day8_10818 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] arr = new int[input];
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0; i<input;i++) {
			arr[i] = scan.nextInt();	
			if(arr[i] > max) max = arr[i];
			else if(arr[i] < min) min = arr[i];
		}
		
		System.out.print(min+" "+max);
		scan.close();
	}
}
