package boj_homework_bronze3to1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1978 {
	
	//틀렷다고 나옴

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		int[] numArr = new int[num];
		String inStr = br.readLine();
		StringTokenizer st = new StringTokenizer(inStr," ");
		
		br.close();
		
		for(int i = 0; i<num; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i<num; i++) {
			boolean tf = true;
			
			for(int j = 2; j<numArr[i]; j++) {
				if(numArr[i]<=1||numArr[i]%2==0) {
					tf = false;
					break;
				}
			}
			if(tf == true) {count +=1;}
			
		}
		System.out.println(count);
	}

}
