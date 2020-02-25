import java.util.Scanner;

public class day58_5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a==0 && b==0) break;
			String result;
			if(a<b) result = "factor";
			else {
				result = "multiple";
				int tmp = b;
				b = a;
				a = tmp;
			}
			
			if(b % a != 0) result = "neither";
			
			System.out.println(result);
		}
		scan.close();
	}

}
