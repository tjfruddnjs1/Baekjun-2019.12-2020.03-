import java.util.Scanner;

public class day23_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		int tmp;
		
		while(arr[0] != 0 && arr[1] != 0 && arr[2] != 0) { 
			arr[0]=scan.nextInt();
			arr[1]=scan.nextInt();
			arr[2]=scan.nextInt();
			
			for(int i=0;i<arr.length;i++) {
				if(arr[0]<arr[i]) {
					tmp = arr[0];
					arr[0] = arr[i];
					arr[i] = tmp;
				}
			}
			arr[0] = (int) Math.pow(arr[0], 2);
			arr[1] = (int) Math.pow(arr[1], 2);
			arr[2] = (int) Math.pow(arr[2], 2);
			if(arr[0] == arr[1] + arr[2]) {
				if(arr[0] == 0) break;
				System.out.println("right");
			}
			else	System.out.println("wrong");
			
		}
	}

}
