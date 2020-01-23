import java.util.*;

public class day25_2447 {
	
	static char arr[][]; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		arr = new char[n][n];
		
		for(int i=0;i<arr.length;i++) {
			Arrays.fill(arr[i],' ');
		}
		 		
		star(0,0,n);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	private static void star(int a,int b,int n) { 
		int div = 0;
		if(n==1) { 
			arr[a][b] = '*';
			return;
		}
		 div= n/3; 
		
		for(int i=0;i<3;i++) { 
			for(int j=0;j<3;j++) {
				if(i==1 && j ==1) continue;
				star(a+(div*i),b+(div*j),div); 
			}
		}        
	}
}