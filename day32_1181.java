import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day32_1181 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine().trim());
		List<String> list = new ArrayList<>();
		String[] arr = new String[input];
		int[] length = new int[input];
		
		for(int i=0;i<input;i++) {
			arr[i] = br.readLine().trim();
			if(list.contains(arr[i])) continue;
			else {
				list.add(arr[i]);
				length[i] = arr[i].length();
			}
		}
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() > o2.length()) return 1;
				else if(o1.length()==o2.length()) return o1.compareTo(o2);
				return -1;
			}
		});
		
		for(String i:list) {
			System.out.println(i);
		}
		
	}

}
