package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_9086 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		 
		for(int i = 1; i <= num; i++) {
			char firstStr;
			char lastStr;
			
			String testString = new String();
			testString = br.readLine();
			
			firstStr = testString.charAt(0);
			lastStr = testString.charAt(testString.length()-1);
			sb.append(firstStr).append(lastStr).append('\n');
			
		}
		
		System.out.println(sb);
		
	}

}
