import java.util.Scanner;

public class day2_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = new Scanner(System.in).nextInt();
		int min = new Scanner(System.in).nextInt();
		int early = min - 45;
		
		if(early < 0) {
			hour--;
			early *= -1;
		}
		if(hour < 0) {
			hour += 24;
		}
		System.out.println(hour);
		System.out.print(early);
	}

}
