
import java.util.Scanner;

public class day6_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		Integer[] arr = new Integer[N];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			if(arr[i]<X) {
			System.out.print(arr[i]+" ");
			}
		}
	}

}
