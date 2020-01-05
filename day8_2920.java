import java.util.Scanner;

public class day8_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String asc = "1 2 3 4 5 6 7 8";
		String dsc = "8 7 6 5 4 3 2 1";
		
		
		if(input.equals(asc)) System.out.println("ascending");
		else if(input.equals(dsc)) System.out.println("descending");
		else System.out.println("mixed");
	}

}
