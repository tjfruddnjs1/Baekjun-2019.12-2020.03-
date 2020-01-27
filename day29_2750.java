import java.util.Scanner;

public class day29_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] arr = new int[input];
		
		for(int i=0;i<input;i++) {
			arr[i] = scan.nextInt();
		}
		
		int tmp;
		for(int i=0;i<input;i++) {
			for(int j=i+1;j<input;j++) {
				if(arr[i]>arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0;i<input;i++) {
			System.out.println(arr[i]);
		}
	}

}
