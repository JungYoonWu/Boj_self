package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_25176 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int easy = 1;
		for(int i = 2; i<=N; i++) {
			easy *= i;
		}
		System.out.println(easy);
	}

}
