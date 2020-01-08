import java.util.Scanner;

public class day9_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int[] num = new int[1000];
		int count,n,sum;
		double avg;
		
		for(int i=0;i<A;i++) {
			n = scan.nextInt();
			sum = 0;
			count = 0;
			for(int j=0; j<n;j++) {
				num[j] = scan.nextInt();
				sum += num[j];
			}
			avg = (double)sum/n;
			
			for(int j=0;j<n;j++) {
				if(num[j]> avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0* count / n);
			System.out.println("%");
		}
	}

}
