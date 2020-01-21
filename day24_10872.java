import java.util.Scanner;

public class day24_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int input = scan.nextInt();	
		int sum = 1;
		System.out.println(factorial(input,sum));
		
	}
	
	private static int factorial(int input,int sum) {
		
		if(input == 1) return sum;
		else if(input == 0) return 1;
		else {
			sum *= input;
			input--;
			return factorial(input,sum);
		}
	}

}
