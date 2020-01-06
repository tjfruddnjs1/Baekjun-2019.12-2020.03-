import java.util.Scanner;

public class day9_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int max = Integer.MIN_VALUE;
		int grade;
		int sum = 0;
		
		for(int i=0;i<num;i++) {
		    grade = scan.nextInt();
		    sum += grade;
			if(max < grade) max = grade;
		}
		
		double avg = 0;
		avg = 100.0 * sum / (max * num);
		System.out.printf("%.2f",avg);
		scan.close();
	}

}
