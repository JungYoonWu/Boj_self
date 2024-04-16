package boj_School;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Boj_10809 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inStr = br.readLine();
		int [] alphaLoca = new int [26];
		for(int i = 0; i < alphaLoca.length; i++) {
			alphaLoca[i] = -1;
		}
		
		for(int i = 0; i < inStr.length(); i++) {
			char alpha = inStr.charAt(i);
			
			if(alphaLoca[alpha - 'a'] == -1) {
				alphaLoca[alpha - 'a'] = i;
			}
		}
		for(int i : alphaLoca) {
			bw.write(i + " ");
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}
