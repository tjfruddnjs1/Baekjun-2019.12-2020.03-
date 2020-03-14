package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class day74_2164 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=1;i<=N;i++) {
        	q.add(i);
        }
        
        while(q.size() != 1) {
        	q.poll(); //Return first Number
        	int a = q.poll();
        	q.add(a);
        }
        bw.write(q.poll()+"\n");
        
        bw.flush();
        br.close();
        bw.close();
	}

}
