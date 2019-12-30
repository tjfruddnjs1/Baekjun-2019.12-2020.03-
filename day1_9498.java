import java.util.Scanner;

public class day1_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testPoint = new Scanner(System.in).nextInt();
		int Grade = testPoint/10;
		
		 if(Grade>=9) System.out.println('A');
	     else if (Grade>=8) System.out.println('B');
	     else if (Grade>=7) System.out.println('C');
	     else if (Grade>=6) System.out.println('D');
	     else System.out.println('F');
	}

}
