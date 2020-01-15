import java.util.Scanner;

public class day18_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] H = new int[num];
		int[] W = new int[num];
		int[] N = new int[num];
		int numFloor = 0;
		int numRoom;
 		
		for(int i=0;i<num;i++) {
			H[i] = scan.nextInt();
			W[i] = scan.nextInt();
			N[i] = scan.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			numRoom = 1;
			numFloor = N[i]%H[i];
			numRoom += N[i]/H[i];
			if(N[i]%H[i] == 0) {
				numFloor = H[i];
				numRoom = N[i]/H[i];
			}
			System.out.println(numFloor*100+numRoom);
		}
		
		
	}

}
