package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10988 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inStr = br.readLine();
		int count = 0;
		//System.out.println(inStr.length());
		char[] line = new char[inStr.length()];
		char[] palin = new char[inStr.length()];
		
		for(int i = 0; i < inStr.length(); i++) {			//입력받은 문자열을 배열에 저장
			line[i] = inStr.charAt(i);
		}
		
		for(int i = 0; i < inStr.length()/2; i++) {			//palin배열에 뒤집어서 저장
			palin[i] = inStr.charAt(inStr.length()-1-i); 
		}
		
		for(int j = 0; j < inStr.length(); j++) {
			if(palin[j]==line[j]) {
				count += 1;
			}
		}
		
		if(count == inStr.length()-1) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
