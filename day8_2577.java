import java.util.Scanner;

public class day8_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int result = A*B*C;
		int[] arr = new int[10];
		while(result > 0) {
			arr[result%10]++;
			result /= 10;
		}
		
		for(int i=0; i<arr.length;i++)
		System.out.println(arr[i]);
		
		
		
	}

}
