import java.util.Scanner;

public class day42_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int[] num = new int[2];
		num[0] = scan.nextInt();
		num[1] = scan.nextInt();
		
		System.out.println(num[0] * (num[1]%10));
		System.out.println(num[0] * ((num[1]%100)/10));
		System.out.println(num[0] * (num[1]/100));
		System.out.println(num[0] * num[1]);
 	}

}
