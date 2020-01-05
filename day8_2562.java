import java.util.Scanner;

public class day8_2562 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int max = -1000000;
		int tmp = 0;
		
		for(int i=0; i<9;i++) {
			arr[i] = scan.nextInt();	
			if(arr[i] > max) {
				max = arr[i];
				tmp = i;
				}
		}
		
		System.out.println(max);
		System.out.println(tmp);
		scan.close();
	}
}
