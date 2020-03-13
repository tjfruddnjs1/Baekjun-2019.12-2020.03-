package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class day73_18258_noQ_time_over {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int[] arr = new int[input];
		int front = 0;
		int rear = -1;
		
		for(int i=0;i<input;i++) {
			String tmp = br.readLine();
			if(tmp.equals("push")) {
				arr[++rear] = br.read();
			}else if(tmp.equals("pop")) {
				if(rear-front+1 == 0) System.out.println("-1");
				else{
					System.out.println(arr[front++]);
				}
			}else if(tmp.equals("size")) {
				System.out.println(rear-front+1);
			}else if(tmp.equals("empty")) {
				if(rear-front+1 != 0) System.out.println("0");
				else System.out.println("1");
			}else if(tmp.equals("front")) {
				if(rear-front+1 == 0) System.out.println("-1");
				else System.out.println(arr[front]);
			}else if(tmp.equals("back")) {
				if(rear-front+1 == 0) System.out.println("-1");
				else System.out.println(arr[rear]);
			}
			
		}
	}

}
