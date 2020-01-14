import java.util.Scanner;

public class day17_2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int raiseTree = scan.nextInt();
		int slideTree = scan.nextInt();
		int heightTree = scan.nextInt();
		int dayRaiseTree = raiseTree-slideTree;
		int result = 0;
		
		
		result = heightTree/dayRaiseTree;
		if((result-1)*dayRaiseTree + raiseTree > heightTree) result--;
		
		System.out.println(result);
		
	}

}
