import java.util.Scanner;

public class day16_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		if(input%5 == 0) {
            System.out.println(input/5);
            return;
        }
		else {
			int tmp1 = input/5;
			for(int i=tmp1;i>0;i--) {
				int tmp2 = input - (i*5);
				if(tmp2%3 == 0) {
					System.out.println(i+tmp2/3);
                    return;
				}
			}
		}
		
		if(input%3 == 0) {
			System.out.println(input/3);
		}else {
			System.out.println(-1);
		}
        
        return;
		
//		input/3 = 6 , X
//		next
//		input/5 = 3
//		input - 5*3 / 3 = 4, Y
//		X>Y  print Y
//		else print X
	}

}
