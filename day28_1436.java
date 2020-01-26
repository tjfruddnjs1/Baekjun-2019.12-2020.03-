import java.util.Scanner;

public class day28_1436 {

	private static final String num = "666";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(solution(input));
		
	}
	
	private static int solution(int input) {
		int count = 0;
		int index = 0;
		while(count != input) {
		if(String.valueOf(++index).contains(num)) count++;
		}
		
		return index;
	}
	
}
