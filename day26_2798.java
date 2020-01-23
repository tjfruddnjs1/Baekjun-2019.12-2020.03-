import java.util.Scanner;

public class day26_2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int sumMax = scan.nextInt();
		int[] arr = new int[count];
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		firstLine: for (int i = 0; i < count - 2; i++) {
			for (int j = i + 1; j < count - 1; j++) {
				for (int k = j + 1; k < count; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (sum <= sumMax)
						max = Math.max(sum, max);
					if (max == sumMax)
						break firstLine;
				}
			}
		}
		
		System.out.println(max);
	}

}
