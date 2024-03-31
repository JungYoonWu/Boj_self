package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10988 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inStr = br.readLine();
		int paline = 1;
		
		br.close();
		
		
		//==로 전체 구간을 다 조사해서 검사하는거보다 !=로 틀렸을때 검사를 break로 멈추고 값을 반환하는게 더 속도가 빠름 알겠징?
		for(int i = 0; i<inStr.length()/2; i++) {
			if(inStr.charAt(i) != inStr.charAt(inStr.length()-1-i)) {
				paline = 0;
				break;
			}
		}
		
		System.out.println(paline);
		
	}

}
