import java.util.Scanner;

public class day19_1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long case_count = scan.nextInt();
		for (long i = 0; i < case_count; i++) {
			long x_pos = scan.nextInt();
			long y_pos = scan.nextInt();
			long length = y_pos - x_pos;
			long answer = 1;
			long dis = 0;

			while (length > dis) {
				answer++;
				dis += answer / 2;
			}
			System.out.println(answer-1);
		}

	}
}