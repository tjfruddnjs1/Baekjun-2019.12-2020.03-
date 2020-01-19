import java.util.Scanner;

public class day21_9020 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int first = 0, second = 0;

		for (int i = 0; i < N; i++) {
			int input = scan.nextInt();
			for (first = input / 2, second = input / 2;; first++, second--) {
				input = first + second;
				if (check(first) && check(second)) {
					System.out.println(second+" "+first);
					break;
				}
			}
		}
	}

	private static boolean check(int num) {
		for (int i = 2; i <= num/2 ; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}