package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class day73_18258 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		while(N-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			
			String command = st.nextToken();
			
			if(command.equals("push")) queue.offer(Integer.parseInt(st.nextToken()));
			
			if(command.equals("pop")){
				if(!queue.isEmpty()) sb.append(queue.poll() + "\n");
				else sb.append("-1" + "\n");
			}
			
			if(command.equals("size")) sb.append(queue.size() + "\n");

			if(command.equals("empty")) {
				if(queue.isEmpty()) sb.append("1" + "\n");
				else sb.append("0" + "\n");
			}
			
			if(command.equals("front")) {
				if(!queue.isEmpty()) sb.append(queue.peekFirst() + "\n");
				else sb.append("-1" + "\n");
			}
			
			if(command.equals("back")) {
				if(!queue.isEmpty()) sb.append(queue.peekLast() + "\n");
				else sb.append("-1" + "\n");
			}
		}
		
		System.out.print(sb.toString());
	}
}