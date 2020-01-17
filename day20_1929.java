import java.util.Scanner;

public class day20_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int startNum = scan.nextInt();
		int finalNum = scan.nextInt();
		int sum = 0;
		int cnt = 0;
		
		for(int i=startNum;i<=finalNum;i++) {
			if(i==2) System.out.println("2");
			for(int j=2;j<=(int)Math.sqrt(i)+1;j++) {
				if(i%j == 0)	cnt++;
				if(cnt == 1) 	break;
			}
			if(cnt==0 && i!=1) {
				System.out.println(i);
			}
			cnt=0;
		}
		
	}

}
