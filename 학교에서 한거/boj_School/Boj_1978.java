package boj_School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1978 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		String inStr = br.readLine();
		StringTokenizer st = new StringTokenizer(inStr, " ");
		
		for(int i = 0; i < num; i++) {
			int key = Integer.parseInt(st.nextToken());
			boolean tf = false;
			for(int j = 2; j < key; j++) {
				if(key <= 1) {
					//tf = false;
				}
				
				if(key % j == 0) {
					//tf = false;
				}else {
					//tf = true;
				}
				
			}
			//if(tf=true) {
			//	count++;
			//}
		}
		
		System.out.println(count);
	}

}
