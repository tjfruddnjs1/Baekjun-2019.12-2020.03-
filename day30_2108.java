import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class day30_2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int[] arr = new int[input];
		int[] check = new int[8001];
		int sum = 0;
		
		for(int i=0;i<input;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			check[arr[i]+4000]++;
			sum+=arr[i];
		}
		
		int max = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<8001;i++) {
			if(check[max]<check[i]) {
				max=i;
				list.clear();
			}else if(check[i] != 0 && check[i] == check[max]) {
				list.add(i-4000);
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println((int)Math.round((double)sum/input));
		System.out.println(arr[input/2]);
		if(list.size()!= 0) {
			System.out.println(list.get(0));
		}else 
			System.out.println(max-4000);
		System.out.println(arr[input-1]-arr[0]);
	}

}
