import java.util.Scanner;

public class day20_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int startNum = scan.nextInt();
		int finalNum = scan.nextInt();
		int sum = 0;
		int min = 10001;
		int cnt = 0;
		
		for(int i=startNum;i<=finalNum;i++) {
			for(int j=2;j<i;j++) {
				if(i%j == 0)	cnt++; 
			}
			if(cnt==0 && i!=1) {
				sum+=i;
				if(min>i) 	min=i;
			}
			cnt=0;
		}
		if(min == 10001) System.out.println("-1");
		else {
		System.out.println(sum);
		System.out.println(min);
		}
	}

}
