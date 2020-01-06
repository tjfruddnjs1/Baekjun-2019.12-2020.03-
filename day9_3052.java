import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day9_3052 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Set<Integer> numSet = new HashSet<>();
		
		for(int i=0;i<10;i++) {
			int N = scan.nextInt();
			
			numSet.add(N%42);
		}
		System.out.println(numSet.size());
	}

}
