
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day31_1427 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine().trim());
		List<Integer> list = new ArrayList<>();
		while(input/10 != 0) {
			list.add(input%10);
			input /= 10;
		}	
		list.add(input);
		Collections.sort(list, Collections.reverseOrder()); //reverseOrder : 
		
		for(int i:list) {
			System.out.print(i);
		}
	}

}
