package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1978Mk2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			boolean isPrime = true;
			
			if(num == 1) {continue;}
			
			for(int i = 2; i<num; i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {count +=1;}
		}
		
		System.out.println(count);
	}

}
