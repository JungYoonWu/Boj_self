package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_2609 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inStr = br.readLine();
		StringTokenizer st = new StringTokenizer(inStr, " ");
		StringBuilder sb = new StringBuilder();
		int numA = Integer.parseInt(st.nextToken());
		int numB = Integer.parseInt(st.nextToken());
		int sum = 0;
		int count = 0;
		
		int i = numA;
		while(i<=numB){
			boolean tf = true;
			for(int j = 2; j < i; j++) {
				if(i%j==0) {
					tf = false;
					break;
				}
			}
			if(tf) {
				sum += i;
				count++;
				if(count==1) {
					sb.append(i).append(" ");
				}
			}
			
			i++;
		}
		if(count==0) {
			sb.append("-1");
		}
		bw.write(sum+"\n"+sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	

}
