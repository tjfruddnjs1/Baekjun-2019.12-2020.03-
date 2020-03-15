package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class day75_11866 {

	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());
        Queue<Integer> josephus = new LinkedList<>();
        
        for(int i=1;i<=num;i++) {
        	josephus.add(i);
        }
        
        int count = 0;
        int output = 0;
        sb.append("<");
        while(output != num) {
        	int pollNum = josephus.poll();
        	count++;
        	
        	if(count == index) {
        		sb.append(pollNum+", ");
        		output++;
        		count = 0;
        	}else {
        	josephus.add(pollNum);
        	}
        }
        
        sb.delete(sb.length()-2, sb.length()); //last element's (, )
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
	}

}
