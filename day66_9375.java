import java.util.HashMap;
import java.util.Scanner;

public class day66_9375 {
	
	/*
	 * result = (same kind of Clothe+1) * ... * (same kind of clothe+1) - 1 + find rule & combination , Hashmap
	 * 
	 */
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		for(int i=0;i<num;i++) {
			int kindOfNum = scan.nextInt();
			HashMap<String,Integer> hm = new HashMap<>();
			
			for(int j=0;j<kindOfNum;j++) {
				String s1 = scan.next();
				String s2 = scan.next();
				if(hm.containsKey(s2)) {
					int tmp = hm.get(s2);
					hm.put(s2, tmp+1);
				}else {
					hm.put(s2, 1);
				}
			}
			
			int result = 1;
			for(int val : hm.values()) {
				result *= val+1;
			}
			System.out.println(result-1);
		}
		
		
	}

}
