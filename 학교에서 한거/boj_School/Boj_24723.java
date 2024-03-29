package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_24723 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int cases = 1;
		
		for(int i = 1; i <= num; i++) {
			cases = cases*2;
		}
		
		System.out.println(cases);
		
	}

}
