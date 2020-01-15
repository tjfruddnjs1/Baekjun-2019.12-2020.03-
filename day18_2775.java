import java.util.Scanner;

public class day18_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] numFloor = new int[N];
		int[] numUnit = new int[N];
		int max = 0;

		for (int i = 0; i < N; i++) {
			numFloor[i] = scan.nextInt();
			numUnit[i] = scan.nextInt();
			System.out.println(numberArray(numFloor[i],numUnit[i]));
		}
		
	}
	private static int numberArray(int numFloor,int numUnit) {
		if(numFloor == 0) return numUnit;
		else if (numUnit == 0) return 0;
		else return numberArray(numFloor,numUnit-1) + 
				numberArray(numFloor-1,numUnit);
	}
}

