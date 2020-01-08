import java.util.Scanner;

public class day11_11720 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int[N];
		String result = scan.next().trim();
		int sum = 0;
		
		for(int i=0;i<N;i++) {
			char tmp = result.charAt(i);
			arr[i] = Character.getNumericValue(tmp);
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
