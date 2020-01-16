import java.util.Scanner;

public class day19_1978 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int answer = 0;
		
		for (int i = 0; i < input; i++) {
			int num = scan.nextInt();

			if (num != 1) {
				if (num == 2)
					answer++;
				else {
					for (int j = 2; j <= num - 1; j++) {
						if (num % j != 0) {
							if(j == num-1) answer++;
						} else break;

					}
				}
			}
		}
		System.out.println(answer);
	}
}
